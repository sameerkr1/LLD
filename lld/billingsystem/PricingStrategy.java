package org.example.billingsystem;

import org.example.billingsystem.enums.VehicleType;

public interface PricingStrategy {

    Double getPricePerKm(VehicleType vehicleType);
}
