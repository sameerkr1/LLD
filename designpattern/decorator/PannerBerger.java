package org.example.designpattern.decorator;

public class PannerBerger extends Berger{
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        System.out.println("Panner Berger Description");
        return "";
    }
}
