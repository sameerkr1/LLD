package org.example.designpattern.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class BillPughSingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughSingletonHelper.instance;
    }
}
