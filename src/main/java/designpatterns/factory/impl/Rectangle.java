package main.java.designpatterns.factory.impl;

public class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println("Inside Rectangle::draw() method.");
    }
}
