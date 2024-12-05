package org.example.billingsystem.model;

import lombok.Builder;
import lombok.Data;
import org.example.billingsystem.enums.VehicleType;

@Data
@Builder
public class Vehicle {

    private String name;
    private String vehicleNumber;
    private VehicleType vehicleType;

}
