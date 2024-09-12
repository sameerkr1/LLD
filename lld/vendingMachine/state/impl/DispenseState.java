package org.example.lld.vendingMachine.state.impl;

import org.example.lld.vendingMachine.client.VendingMachine;
import org.example.lld.vendingMachine.model.Coin;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.state.IState;

public class DispenseState implements IState {

    @Override
    public void insertCoinToVendingMachine(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Not allowed");
    }

    @Override
    public void selectionOfItemToVendingMachine(VendingMachine vendingMachine, Inventory inventory, String code) {
        //
    }

    @Override
    public void cancelOfItemToVendingMachine() {

    }

    @Override
    public void dispenseOfItemFromVendingMachine() {
        // dispensing and returning product and making vending machine in idle state
    }

    @Override
    public Coin returnOrRefundOfCoinsFromVendingMachine() {
        return null;
    }
}
