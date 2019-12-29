package com.company;

import javafx.scene.shape.Circle;
import java.awt.*;


public class Main {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(5,7);
        Square  square = new Square(5);
        Oval oval=new Oval(4);
        Circle circle=new Circle(7);

        System.out.println("the area of rectangle is :"+rectangle.area());
        System.out.println("the surface of rectangle is :"+rectangle.surface());
        System.out.println("the area of square is :"+square.area());
        System.out.println("the surface of square is :"+square.surface());
        System.out.println("the area of oval is :"+oval.area());
        System.out.println("the surface of oval is :"+oval.surface());
        System.out.println("the area of circle is :"+ Circle.area());
        System.out.println("the surface of circle is :"+ Circle.surface());
        // write your code here
    }
}
