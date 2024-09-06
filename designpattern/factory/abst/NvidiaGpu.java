package org.example.designpattern.factory.abst;

public class NvidiaGpu implements GPU{
    @Override
    public void renderGraphics() {
        System.out.println("NvidiaGpu");
    }
}
