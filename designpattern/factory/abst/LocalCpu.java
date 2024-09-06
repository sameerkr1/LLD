package org.example.designpattern.factory.abst;

public class LocalCpu implements CPU{
    @Override
    public void performOperation() {
        System.out.println("Local-cpu");
    }
}
