package main.java.designpatterns.factory.impl;

public class Circle implements Shape{
    @Override
    public void draw() {
       System.out.println("Inside Square::draw() method.");
    }
}
