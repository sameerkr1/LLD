package org.example.designpattern.decorator;

public class ExtraCheeseBerger extends BergerDecorator{

    private final Berger berger;

    ExtraCheeseBerger(Berger berger){
        this.berger = berger;
    }

    @Override
    public int getCost() {
        return berger.getCost()+30;
    }

    @Override
    public String getDescription() {
        return berger.getDescription() + "extra cheese";
    }
}
