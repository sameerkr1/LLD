package org.example.billingsystem.model;

import lombok.Data;
import org.example.billingsystem.enums.TripStatus;
import org.example.billingsystem.enums.TripType;

@Data
public class Trip {

    private Integer startTime;
    private Integer endTime;
    private Double distanceInKm;
    private TripType tripType;
    private TripStatus tripStatus;

    public Trip(Integer startTime, Integer endTime, Double distanceInKm, TripType tripType, TripStatus tripStatus) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.distanceInKm = distanceInKm;
        this.tripType = tripType;
        this.tripStatus = tripStatus;
    }

}
