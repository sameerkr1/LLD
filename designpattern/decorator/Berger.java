package org.example.designpattern.decorator;

public abstract class Berger {

    private String description;
    private int cost;

    public abstract int getCost();

    public abstract String getDescription();
}
