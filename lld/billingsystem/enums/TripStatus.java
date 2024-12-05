package org.example.billingsystem.enums;

public enum TripStatus {

    COMPLETED("COMPLETED"),
    CANCELLED_BY_CUSTOMER("CANCELLED_BY_CUSTOMER"),
    CANCELLED_BY_DRIVER("CANCELLED_BY_DRIVER");

    private final String name;

    private TripStatus(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
