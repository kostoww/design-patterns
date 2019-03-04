package com.tutorialspoint.patterns.creational.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // get rounded shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // get an object of Shape Rounded Rectangle
        Shape shape1 = shapeFactory.getShape("rectangle");

        // call draw method of Shape Rectangle
        shape1.draw();

        // And for others
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        // get an object of Shape Rounded Rectangle
        Shape shape3 = shapeFactory2.getShape("rectangle");

        // call draw method of Shape Rectangle
        shape3.draw();

        // And for others
        Shape shape4 = shapeFactory2.getShape("square");
        shape4.draw();
    }
}
