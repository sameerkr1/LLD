package org.example.designpattern.factory.abst;

public class LocalGpu implements GPU{
    @Override
    public void renderGraphics() {
        System.out.println("Local Gpu");
    }
}
