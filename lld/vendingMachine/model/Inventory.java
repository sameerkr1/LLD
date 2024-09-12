package org.example.lld.vendingMachine.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<ItemShelf> itemShelfs = new ArrayList<>();

    public List<ItemShelf> getItemShelfs() {
        return itemShelfs;
    }

    public void addInventory(ItemShelf itemShelf) {
        itemShelfs.add(itemShelf);
    }
}
