package customerservice.model;

import customerservice.enums.IssueType;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Builder
public class
Agent {
    private String id;
    private String name;
    private String email;
    private Set<IssueType> issuesSpeciality;
    private List<Issue> issues;
}
