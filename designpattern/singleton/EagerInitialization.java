package org.example.designpattern.singleton;

public class EagerInitialization {
    private static EagerInitialization obj = new EagerInitialization();

    private EagerInitialization(){}

    public EagerInitialization getEagerInitialization() {
        return EagerInitialization.obj;
    }
}
