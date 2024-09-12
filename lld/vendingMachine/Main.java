package org.example.lld.vendingMachine;

import org.example.lld.vendingMachine.client.VendingMachine;
import org.example.lld.vendingMachine.model.Inventory;
import org.example.lld.vendingMachine.model.Item;
import org.example.lld.vendingMachine.model.ItemShelf;
import org.example.lld.vendingMachine.model.ItemType;
import org.example.lld.vendingMachine.state.IState;
import org.example.lld.vendingMachine.state.impl.IdleState;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Item item1 = new Item(ItemType.CAKE, "pastry", 10);
        Item item2 = new Item(ItemType.CAKE, "bag", 15);

        ItemShelf itemShelf1 = new ItemShelf(item1,"112",false);
        ItemShelf itemShelf2 = new ItemShelf(item2,"113",false);

        Inventory inventory = new Inventory();
        inventory.addInventory(itemShelf1);
        inventory.addInventory(itemShelf2);

        vendingMachine.runMachine();
    }
}
