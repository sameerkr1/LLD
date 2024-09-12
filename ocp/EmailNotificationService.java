package org.example.ocp;

public class EmailNotificationService implements NotificationService {

    public static int item=1;
    public int hey;

    public static int add(int a,double b){
        int x =(int)b;
        return a+x;
    }

    public static void xyz(int a){
        item=a+1;
    }

    @Override
    public void sendOtp(String otp) {
        System.out.println("Email sent to " + otp);
    }
}
