package customerservice;

import customerservice.model.Agent;
import customerservice.model.Issue;

import java.util.Comparator;
import java.util.Map;

public class LeastWorkloadStrategy implements IssueAssignmentStrategy {
    @Override
    public Agent assignIssue(Issue issue, Map<String, Agent> emailAgentMap) {
        return emailAgentMap.values()
                .stream()
                .min(Comparator.comparingInt(agent -> agent.getIssues() == null ? 0 : agent.getIssues().size()))
                .orElseThrow(() -> new IllegalStateException("No agents available for assignment."));
    }
}
