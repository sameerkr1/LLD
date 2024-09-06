package org.example.designpattern.factory.abst;

public class HighEndComputer implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new IntelCpu();
    }

    @Override
    public GPU createGPU() {
        return new NvidiaGpu();
    }
}
