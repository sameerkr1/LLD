package customerservice.enums;

public enum IssueType {

    PAYMENT("PAYMENT_RELATED"),
    MUTUAL_FUND("MUTUAL_FUND"),
    GOLD("GOLD"),
    INSURANCE("INSURANCE");

    private final String name;

    private IssueType(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

}
