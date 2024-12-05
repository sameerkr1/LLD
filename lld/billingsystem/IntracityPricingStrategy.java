package org.example.billingsystem;

import org.example.billingsystem.enums.VehicleType;

public class IntracityPricingStrategy implements PricingStrategy {

    @Override
    public Double getPricePerKm(VehicleType vehicleType) {
        return switch (vehicleType) {
            case VehicleType.ECONOMY -> 5.0;
            case VehicleType.PREMIUM -> 12.0;
            case VehicleType.LUXURY -> 15.0;
            default -> throw new IllegalArgumentException("vehicle type is invalid");
        };
    }
}
