package org.example.designpattern.decorator;

public class ChickenBerger extends Berger {
    @Override
    public int getCost() {
        return 200;
    }

    public String getDescription(){
        System.out.println("This is chicken berger");
        return "This is chicken berger";
    }
}
