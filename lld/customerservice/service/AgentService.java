package customerservice.service;

import customerservice.enums.IssueType;
import customerservice.model.Agent;
import customerservice.model.Issue;
import lombok.Data;
import org.springframework.util.ObjectUtils;

import java.util.*;

@Data
public class AgentService {

    private final Map<String, Agent> emailAgentMap;

    public AgentService() {
        this.emailAgentMap = new HashMap<>();
    }

    public String addAgent(String email, String name, List<String> supportedIssueTypes) {
        validateAgentInputs(email, name, supportedIssueTypes);

        Set<IssueType> issueTypes = new HashSet<>();
        for (String issueType : supportedIssueTypes) {
            try {
                issueTypes.add(IssueType.valueOf(issueType.toUpperCase()));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid issue type: " + issueType);
            }
        }

        Agent agent = Agent.builder()
                .name(name)
                .email(email)
                .id(UUID.randomUUID().toString())
                .issuesSpeciality(issueTypes)
                .build();

        emailAgentMap.putIfAbsent(email, agent);
        return "Agent with ID: " + agent.getId() + " is created.";
    }

    public Map<String, List<Issue>> viewAgentWorkHistory() {
        if (emailAgentMap.isEmpty()) {
            throw new IllegalStateException("No agents available to retrieve work history.");
        }

        Map<String, List<Issue>> agentIdIssueMap = new HashMap<>();
        for (Agent agent : emailAgentMap.values()) {
            if (!ObjectUtils.isEmpty(agent.getIssues())) {
                agentIdIssueMap.put(agent.getId(), agent.getIssues());
            }
        }

        return agentIdIssueMap;
    }

    private void validateAgentInputs(String email, String name, List<String> supportedIssueTypes) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or empty.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (supportedIssueTypes == null || supportedIssueTypes.isEmpty()) {
            throw new IllegalArgumentException("Supported issue types cannot be null or empty.");
        }
    }
}
