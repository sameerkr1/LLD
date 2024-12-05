package org.example.billingsystem.service;

import lombok.Data;
import org.example.billingsystem.model.Driver;
import org.example.billingsystem.model.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

@Data
public class DriverService {

    private HashMap<String, Driver> driverHashMap;

    public DriverService() {
        driverHashMap = new HashMap<>();
    }

    public void addDriver(String driverName, String phoneNumber, String licenceNumber) {
        if (driverHashMap.containsKey(driverName)) {
            throw new RuntimeException("Driver name already found");
        }

        driverHashMap.put(driverName,
                Driver.builder().name(driverName)
                        .licenceNumber(licenceNumber)
                        .phoneNumber(phoneNumber)
                        .trips(new ArrayList<>())
                        .build());
    }

    public void mapDriverToVehicle(String driverName, Vehicle vehicle) {
        Driver driver = driverHashMap.get(driverName);
        driver.setVehicle(vehicle);
    }

}
