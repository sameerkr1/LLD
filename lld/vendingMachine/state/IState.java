package org.example.lld.vendingMachine.state;

import org.example.lld.vendingMachine.client.VendingMachine;
import org.example.lld.vendingMachine.model.Coin;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.model.ItemShelf;

public interface IState {

    void insertCoinToVendingMachine(VendingMachine vendingMachine, Coin coin);

    void selectionOfItemToVendingMachine(VendingMachine vendingMachine, Inventory inventory, String code);

    void cancelOfItemToVendingMachine();

    void dispenseOfItemFromVendingMachine();

    Coin returnOrRefundOfCoinsFromVendingMachine();

}
