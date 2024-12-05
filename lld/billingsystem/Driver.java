package org.example.billingsystem;

import org.example.billingsystem.manager.AllenCabDriverBillingSystem;

public class Driver {

    public static void main(String[] args) {
        AllenCabDriverBillingSystem allenCabDriverBillingSystem = AllenCabDriverBillingSystem.getInstance();

        allenCabDriverBillingSystem.addDriver("Sachin", "+91-9936673000", "DL_01");
        allenCabDriverBillingSystem.addDriver("Ramesh", "+91-9936673011", "DL_02");
        allenCabDriverBillingSystem.addDriver("Manjunath", "+91-993667301", "DL_03");

        allenCabDriverBillingSystem.addVehicle("KA-01-2222", "Maruti Suzuki", "ECONOMY");
        allenCabDriverBillingSystem.addVehicle("KA-01-2223", "Ertiga", "PREMIUM");

        allenCabDriverBillingSystem.addTrip(50.0, 1723116023, 1723117023, "INTRACITY", "COMPLETED", "Ramesh");

        allenCabDriverBillingSystem.mapDriverToVehicle("Ramesh", "KA-01-2222");

        Double billAmount = allenCabDriverBillingSystem.getBill("Ramesh");
        System.out.println(billAmount);
    }
}
