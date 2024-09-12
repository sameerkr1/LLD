package org.example.lld.vendingMachine.client;

import org.example.lld.vendingMachine.model.Coin;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.model.ItemShelf;
import org.example.lld.vendingMachine.state.IState;
import org.example.lld.vendingMachine.state.impl.IdleState;

import java.util.List;

public class VendingMachine {

    private IState state;
    Inventory inventory;

    public void runMachine() {
        this.state = new IdleState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void insertCoin(Coin coin) {
        state.insertCoinToVendingMachine(this, coin);
    }

    public void selectionOfItem(String code) {
        state.selectionOfItemToVendingMachine(this, inventory, code);
    }

    public Inventory getInventory() {
        return inventory;
    }


}
