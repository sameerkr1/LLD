package customerservice.enums;

public enum IssueState {
    INITIATED("INITIATED"),
    OPEN("OPEN"),
    RESOLVED("RESOLVED");

    private final String name;

    private IssueState(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
