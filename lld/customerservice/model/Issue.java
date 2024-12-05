package customerservice.model;

import customerservice.enums.IssueState;
import customerservice.enums.IssueType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Issue {
    private String id;
    private String transactionId;
    private IssueType issueType;
    private IssueState issueState;
    private String subject;
    private String description;
    private String customerEmailId;
    private Agent agent;
    private String resolution;
}
