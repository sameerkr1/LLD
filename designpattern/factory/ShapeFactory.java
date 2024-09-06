package org.example.designpattern.factory;

public class ShapeFactory {

    public Shape drawShape(String shapeName) {
        if(shapeName.equals("Rectangle")) {
            return new Rectangle();
        }
        if(shapeName.equals("Circle")) {
            return new Circle();
        }
        if(shapeName.equals("Square")) {
            return new Square();
        }
        return null;
    }
}
