package org.example.lld.vendingMachine.state.impl;

import org.example.lld.vendingMachine.client.VendingMachine;
import org.example.lld.vendingMachine.model.Coin;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.model.Item;
import org.example.lld.vendingMachine.model.ItemShelf;
import org.example.lld.vendingMachine.state.IState;

import java.util.List;

public class CoinInsertedState implements IState {

    @Override
    public void insertCoinToVendingMachine(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Coin is already inserted");
    }

    @Override
    public void selectionOfItemToVendingMachine(VendingMachine vendingMachine, Inventory inventory, String code) {
        List<ItemShelf> itemShelfList = inventory.getItemShelfs();
        for (ItemShelf itemShelf : itemShelfList) {
            if (itemShelf.getCode().equals(code)) {
                itemShelf.setSoldOut(true);
            }
        }
        vendingMachine.setState(new DispenseState());
    }

    @Override
    public void cancelOfItemToVendingMachine() {
        System.out.println("First select the item");
    }

    @Override
    public void dispenseOfItemFromVendingMachine() {
        //
    }

    @Override
    public Coin returnOrRefundOfCoinsFromVendingMachine() {
        return null;
    }
}
