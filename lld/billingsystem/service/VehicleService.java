package org.example.billingsystem.service;

import lombok.Data;
import org.example.billingsystem.enums.VehicleType;
import org.example.billingsystem.model.Vehicle;

import java.util.HashMap;

@Data
public class VehicleService {

    private HashMap<String, Vehicle> vehicleHashMap;

    public VehicleService() {
        vehicleHashMap = new HashMap<>();
    }

    public void addVehicle(String vehicleNumber, String vehicleName, String vehicleType) {
        if (vehicleHashMap.containsKey(vehicleNumber)) {
            throw new RuntimeException("Vehicle already found");
        }
        vehicleHashMap.put(vehicleName,
                Vehicle.builder().name(vehicleName).vehicleNumber(vehicleNumber)
                        .vehicleType(VehicleType.valueOf(vehicleType)).build()
        );
    }

}
