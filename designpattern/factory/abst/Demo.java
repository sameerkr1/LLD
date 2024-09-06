package org.example.designpattern.factory.abst;

public class Demo {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new BudgetFriendlyComputer();
        CPU cpu = computerFactory.createCPU();
        cpu.performOperation();
    }
}
