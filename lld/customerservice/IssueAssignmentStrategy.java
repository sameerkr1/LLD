package customerservice;

import customerservice.model.Agent;
import customerservice.model.Issue;

import java.util.Map;

public interface IssueAssignmentStrategy {
    Agent assignIssue(Issue issue, Map<String, Agent> emailAgentMap);
}
