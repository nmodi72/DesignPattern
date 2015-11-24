package main.java.designpatterns.factory;

import main.java.designpatterns.factory.impl.Shape;

public class FactoryPatternDemo {
    
    static String shapeName;
    
    public FactoryPatternDemo(String shapeName){
        this.shapeName = shapeName;
    }
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape = shapeFactory.getShape(shapeName);

        //call draw method of Circle
        shape.draw();

     }
    
    public static Shape getReturnShape(){
        ShapeFactory shapeFactory = new ShapeFactory();

        //call draw method of Circle
        return shapeFactory.getShape(shapeName);
    }
}
