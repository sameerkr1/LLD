package org.example.designpattern.factory.abst;

public class BudgetFriendlyComputer implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new LocalCpu();
    }

    @Override
    public GPU createGPU() {
        return new LocalGpu();
    }
}
