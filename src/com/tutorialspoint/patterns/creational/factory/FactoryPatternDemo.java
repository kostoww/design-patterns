package com.tutorialspoint.patterns.creational.factory;

public class FactoryPatternDemo {

    /**
     * <p>Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.</p>
     * <p>In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.</p>
     * <h2>Implementation</h2>
     * <p>We're going to create a <i>Shape</i> interface and concrete classes implementing the <i>Shape</i> interface. A factory class <i>ShapeFactory</i> is defined as a next step.</p>
     * <p><i>FactoryPatternDemo</i>, our demo class will use <i>ShapeFactory</i> to get a <i>Shape</i> object. It will pass information (<i>CIRCLE / RECTANGLE / SQUARE</i>) to <i>ShapeFactory</i> to get the type of object it needs.</p>
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
