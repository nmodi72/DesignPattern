package main.java.designpatterns.factory;

import main.java.designpatterns.factory.impl.Circle;
import main.java.designpatterns.factory.impl.Rectangle;
import main.java.designpatterns.factory.impl.Shape;

public class ShapeFactory {
  //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
       if(shapeType == null){
          return null;
       }     
       if(shapeType.equalsIgnoreCase("CIRCLE")){
          return new Circle();
          
       } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
          return new Rectangle();
          
       }
       
       return null;
    }
}
