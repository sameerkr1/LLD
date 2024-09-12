package org.example.lld.vendingMachine.model;

public class Item {

    private ItemType itemType;
    private String name;
    private int price;

    public Item(ItemType itemType, String name, int price) {
        itemType = itemType;
        name = name;
        price = price;
    }
}
