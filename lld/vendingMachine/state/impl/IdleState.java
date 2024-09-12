package org.example.lld.vendingMachine.state.impl;

import org.example.lld.vendingMachine.client.VendingMachine;
import org.example.lld.vendingMachine.model.Coin;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.state.IState;

public class IdleState implements IState {

    @Override
    public void insertCoinToVendingMachine(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.setState(new CoinInsertedState());
    }

    @Override
    public void selectionOfItemToVendingMachine(VendingMachine vendingMachine, Inventory inventory, String code) {
        System.out.println("Please insert the coin first");
    }

    @Override
    public void cancelOfItemToVendingMachine() {
        System.out.println("Please insert the coin first");
    }

    @Override
    public void dispenseOfItemFromVendingMachine() {
        System.out.println("Please insert the coin first");
    }

    @Override
    public Coin returnOrRefundOfCoinsFromVendingMachine() {
        System.out.println("Please insert the coin first");
        return null;
    }
}
