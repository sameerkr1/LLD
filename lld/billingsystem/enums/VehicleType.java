package org.example.billingsystem.enums;

public enum VehicleType {

    ECONOMY("ECONOMY"), PREMIUM("PREMIUM"), LUXURY("LUXURY");

    private final String name;

    private VehicleType(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
