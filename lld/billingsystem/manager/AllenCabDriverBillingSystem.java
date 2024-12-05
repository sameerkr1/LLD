package org.example.billingsystem.manager;

import org.example.billingsystem.IntracityPricingStrategy;
import org.example.billingsystem.OutStationPricingStrategy;
import org.example.billingsystem.PricingStrategy;
import org.example.billingsystem.enums.TripStatus;
import org.example.billingsystem.enums.TripType;
import org.example.billingsystem.model.Driver;
import org.example.billingsystem.model.Trip;
import org.example.billingsystem.model.Vehicle;
import org.example.billingsystem.service.DriverService;
import org.example.billingsystem.service.TripService;
import org.example.billingsystem.service.VehicleService;

import java.util.List;

public class AllenCabDriverBillingSystem {

    private TripService tripService;
    private DriverService driverService;
    private VehicleService vehicleService;

    public AllenCabDriverBillingSystem() {
        this.tripService = new TripService();
        this.driverService = new DriverService();
        this.vehicleService = new VehicleService();
    }

    public void addVehicle(String licenceNumber, String vehicleName, String vehicleType) {
        vehicleService.addVehicle(licenceNumber, vehicleName, vehicleType);
    }

    public void addDriver(String driverName, String phoneNumber, String licenceNumber) {
        driverService.addDriver(driverName, phoneNumber, licenceNumber);
    }

    public void addTrip(Double distance, Integer startTime, Integer endTime, String tripType, String tripStatus, String driverName) {
        Driver driver = driverService.getDriverHashMap().get(driverName);
        tripService.addTrip(distance, startTime, endTime, tripType, tripStatus, driver);
    }

    public void mapDriverToVehicle(String driverName, String vehicleNumber) {
        Vehicle vehicle = vehicleService.getVehicleHashMap().get(vehicleNumber);
        driverService.mapDriverToVehicle(driverName, vehicle);
    }

    public Double getBill(String driverName) {
        if (!driverService.getDriverHashMap().containsKey(driverName)) {
            throw new RuntimeException("Driver not found");
        }

        Driver driver = driverService.getDriverHashMap().get(driverName);
        List<Trip> trips = driver.getTrips();

        double bill = 0.0;
        for (Trip trip : trips) {
            if (trip.getTripStatus().equals(TripStatus.COMPLETED)) {
                PricingStrategy pricingStrategy = getPricingStrategy(trip.getTripType());
                bill += pricingStrategy.getPricePerKm(driver.getVehicle().getVehicleType()) * trip.getDistanceInKm();
            } else {
                if (trip.getTripStatus().equals(TripStatus.CANCELLED_BY_CUSTOMER)) {
                    bill += 10;
                } else bill -= 10;
            }
        }

        return bill;
    }

    private PricingStrategy getPricingStrategy(TripType tripType) {
        if (TripType.INTRACITY.equals(tripType)) return new IntracityPricingStrategy();
        else return new OutStationPricingStrategy();
    }

    // intracity +

}
