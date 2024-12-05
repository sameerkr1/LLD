package customerservice.manager;

import customerservice.IssueAssignmentStrategy;
import customerservice.LeastWorkloadStrategy;
import customerservice.enums.IssueState;
import customerservice.model.Agent;
import customerservice.model.Issue;
import customerservice.service.AgentService;
import customerservice.service.IssueService;
import customerservice.validator.CustomerSupportValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSupportManager {

    private static CustomerSupportManager instance;
    private Map<String, List<Issue>> agentIssueMap;
    private final IssueService issueService;
    private final AgentService agentService;
    private final IssueAssignmentStrategy assignmentStrategy;

    public CustomerSupportManager(IssueAssignmentStrategy issueAssignmentStrategy) {
        this.issueService = new IssueService();
        this.agentService = new AgentService();
        this.agentIssueMap = new HashMap<>();
        this.assignmentStrategy = issueAssignmentStrategy;
    }

    public void createIssue(String transactionId, String issueType, String subject, String description, String customerEmailId) {
        CustomerSupportValidator.validateIssueInputs(transactionId, issueType, subject, description, customerEmailId);
        issueService.createIssue(transactionId, issueType, subject, description, customerEmailId);
    }

    public void addAgent(String agentEmail, String name, List<String> supportedIssueType) {
        CustomerSupportValidator.validateAgentInputs(agentEmail, name, supportedIssueType);
        agentService.addAgent(agentEmail, name, supportedIssueType);
    }

    public void assignIssue(String issueId) {
        Issue issue = issueService.getIssueMap().get(issueId);
        Map<String, Agent> emailAgentMap = agentService.getEmailAgentMap();
        CustomerSupportValidator.validateIssueAssignment(issueId, issue, emailAgentMap);

        // first strategy
        Agent agent = assignmentStrategy.assignIssue(issue, agentService.getEmailAgentMap());
        if (agent.getIssues().isEmpty()) {
            agent.getIssues().add(issue);
            issue.setIssueState(IssueState.OPEN);
            issue.setAgent(agent);
            return;
        }

        // 2nd stategy
//        for (Agent agent : emailAgentMap.values()) {
//            if (agent.getIssues() == null) {
//                throw new IllegalStateException("Agent issues list is null.");
//            }
//            if (agent.getIssues().isEmpty()) {
//                agent.getIssues().add(issue);
//                issue.setIssueState(IssueState.OPEN);
//                issue.setAgent(agent);
//                return;
//            }
//        }

        throw new IllegalStateException("No suitable agent available to handle the issue.");
    }

    public String updateIssue(String issueId, String status, String resolution) {
        if (issueId == null || status == null) {
            throw new IllegalArgumentException("Issue ID and status cannot be null.");
        }
        return issueService.updateIssue(issueId, status, resolution);
    }

    public String resolveIssue(String issueId, String resolution) {
        if (issueId == null || resolution == null) {
            throw new IllegalArgumentException("Issue ID and resolution cannot be null.");
        }
        return issueService.resolveIssue(issueId, resolution);
    }

    public Map<String, List<Issue>> viewAgentWorkHistory() {
        Map<String, List<Issue>> workHistory = agentService.viewAgentWorkHistory();
        CustomerSupportValidator.validateAgentWorkHistory(workHistory);
        return workHistory;
    }
}
