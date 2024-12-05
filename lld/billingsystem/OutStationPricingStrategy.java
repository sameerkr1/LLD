package org.example.billingsystem;

import org.example.billingsystem.enums.VehicleType;

public class OutStationPricingStrategy implements PricingStrategy {
    @Override
    public Double getPricePerKm(VehicleType vehicleType) {
        return switch (vehicleType) {
            case VehicleType.ECONOMY -> 10.0;
            case VehicleType.PREMIUM -> 24.0;
            case VehicleType.LUXURY -> 30.0;
            default -> throw new IllegalArgumentException("vehicle type is invalid");
        };
    }
}
