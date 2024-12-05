package org.example.billingsystem.service;

import org.example.billingsystem.enums.TripStatus;
import org.example.billingsystem.enums.TripType;
import org.example.billingsystem.model.Driver;
import org.example.billingsystem.model.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripService {

    public void addTrip(Double distance, Integer startTime, Integer endTime, String tripType, String tripStatus, Driver driver) {
        Trip trip = new Trip(startTime, endTime, distance, TripType.valueOf(tripType), TripStatus.valueOf(tripStatus));
        List<Trip> trips = driver.getTrips();
        trips.add(trip);
        driver.setTrips(trips);
    }
}
