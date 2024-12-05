package customerservice.service;

import customerservice.enums.IssueState;
import customerservice.enums.IssueType;
import customerservice.model.Issue;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
public class IssueService {

    private final Map<String, Issue> issueMap;

    public IssueService() {
        this.issueMap = new HashMap<>();
    }

    public Issue createIssue(String transactionId, String customerIssueType, String subject, String description, String customerEmailId) {
        validateIssueInputs(transactionId, customerIssueType, subject, description, customerEmailId);

        IssueType issueType;
        try {
            issueType = IssueType.valueOf(customerIssueType.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid issue type: " + customerIssueType, e);
        }

        Issue issue = Issue.builder()
                .id(UUID.randomUUID().toString())
                .issueState(IssueState.INITIATED)
                .transactionId(transactionId)
                .issueType(issueType)
                .subject(subject)
                .description(description)
                .customerEmailId(customerEmailId)
                .build();

        issueMap.put(issue.getId(), issue);
        return issue;
    }

    public String updateIssue(String issueId, String status, String resolution) {
        Issue issue = issueMap.get(issueId);
        if (issue == null) {
            throw new IllegalArgumentException("No issue found with ID: " + issueId);
        }

        if (IssueState.RESOLVED.equals(issue.getIssueState())) {
            throw new IllegalStateException("Issue is already in resolved state.");
        }

        IssueState issueState;
        try {
            issueState = IssueState.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid issue status: " + status, e);
        }

        issue.setIssueState(issueState);
        issue.setResolution(resolution);
        return "Issue status has been changed to " + issueState;
    }

    public String resolveIssue(String issueId, String resolution) {
        Issue issue = issueMap.get(issueId);
        if (issue == null) {
            throw new IllegalArgumentException("No issue found with ID: " + issueId);
        }

        if (IssueState.RESOLVED.equals(issue.getIssueState())) {
            throw new IllegalStateException("Issue is already in resolved state.");
        }

        issue.setIssueState(IssueState.RESOLVED);
        issue.setResolution(resolution);
        return "Issue status has been changed to " + IssueState.RESOLVED;
    }

    private void validateIssueInputs(String transactionId, String customerIssueType, String subject, String description, String customerEmailId) {
        if (transactionId == null || transactionId.isBlank()) {
            throw new IllegalArgumentException("Transaction ID cannot be null or empty.");
        }
        if (customerIssueType == null || customerIssueType.isBlank()) {
            throw new IllegalArgumentException("Issue type cannot be null or empty.");
        }
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject cannot be null or empty.");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
        if (customerEmailId == null || customerEmailId.isBlank()) {
            throw new IllegalArgumentException("Customer email ID cannot be null or empty.");
        }
    }
}
