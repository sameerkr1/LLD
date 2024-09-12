package org.example.lld.vendingMachine.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {

    private Item item;
    private String code;
    private boolean isSoldOut;

    public ItemShelf(Item item, String code, boolean isSoldOut) {
        this.item = item;
        this.code = code;
        this.isSoldOut = isSoldOut;
    }

    public Item getItem() {
        return item;
    }

    public String getCode() {
        return code;
    }
}
