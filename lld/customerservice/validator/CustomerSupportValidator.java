package customerservice.validator;

import customerservice.model.Agent;
import customerservice.model.Issue;

import java.util.List;
import java.util.Map;

public class CustomerSupportValidator {

    public static void validateIssueInputs(String transactionId, String issueType, String subject, String description, String customerEmailId) {
        if (transactionId == null || issueType == null || subject == null || description == null || customerEmailId == null) {
            throw new IllegalArgumentException("Invalid arguments for creating an issue. All fields are required.");
        }
    }

    public static void validateAgentInputs(String agentEmail, String name, List<String> supportedIssueType) {
        if (agentEmail == null || name == null || supportedIssueType == null || supportedIssueType.isEmpty()) {
            throw new IllegalArgumentException("Invalid arguments for adding an agent. All fields are required.");
        }
    }

    public static void validateIssueAssignment(String issueId, Issue issue, Map<String, Agent> emailAgentMap) {
        if (issueId == null) {
            throw new IllegalArgumentException("Issue ID cannot be null.");
        }
        if (issue == null) {
            throw new IllegalStateException("No issue found with the provided ID: " + issueId);
        }
        if (emailAgentMap == null || emailAgentMap.isEmpty()) {
            throw new IllegalStateException("No agents available to assign the issue.");
        }
    }

    public static void validateAgentWorkHistory(Map<String, List<Issue>> workHistory) {
        if (workHistory == null) {
            throw new IllegalStateException("Unable to fetch agent work history.");
        }
    }
}
