package org.example.billingsystem.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Driver {

    private String name;
    private String phoneNumber;
    private String licenceNumber;
    private List<Trip> trips;
    private Vehicle vehicle;

}
