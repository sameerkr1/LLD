package org.example.designpattern.factory.abst;

public class IntelCpu implements CPU{
    @Override
    public void performOperation() {
        System.out.println("Intel Cpu");
    }
}
