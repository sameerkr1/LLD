package org.example.srp;

public class NotificationService {

    public void sendOtp(String medium){
        if(medium.equals("email")){
            System.out.println("email");
        }else if(medium.equals("phone")){
            System.out.println("phone");
        }
    }
}
