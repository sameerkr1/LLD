package org.example.billingsystem.enums;

public enum TripType {

    INTRACITY("INTRACITY"),
    OUTSTATION("OUTSTATION");

    private final String name;

    private TripType(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
