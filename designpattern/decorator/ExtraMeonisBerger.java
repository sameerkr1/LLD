package org.example.designpattern.decorator;

public class ExtraMeonisBerger extends BergerDecorator{

    private Berger berger;

    ExtraMeonisBerger(Berger berger) {
        this.berger = berger;
    }


    @Override
    public int getCost() {
        return berger.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return berger.getDescription()  + "Extra meonis";
    }
}
