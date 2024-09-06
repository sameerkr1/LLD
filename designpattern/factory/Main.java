package org.example.designpattern.factory;

public class Main {
    public static void main(String[] args) {
//        Shape shape1= new Rectangle();
//        shape1.draw();
//
//        Shape shape2= new Circle();
//        shape2.draw();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.drawShape("Circle");
        shape.draw();
    }
}
