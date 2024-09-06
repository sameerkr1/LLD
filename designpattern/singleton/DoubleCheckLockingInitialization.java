package org.example.designpattern.singleton;

public class DoubleCheckLockingInitialization {

    private volatile static DoubleCheckLockingInitialization instance = null;

    private DoubleCheckLockingInitialization() {}

    public static DoubleCheckLockingInitialization getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingInitialization.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingInitialization();
                }
            }
        }
        return instance;
    }
}
