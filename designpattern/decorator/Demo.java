package org.example.designpattern.decorator;

public class Demo {
    public static void main(String[] args) {
        Berger berger = new ChickenBerger();

        BergerDecorator decorator = new ExtraCheeseBerger(berger);
        System.out.println(decorator.getDescription());
        System.out.println(decorator.getCost());
    }
}
