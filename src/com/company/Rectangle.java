package com.company;

import com.company.Shape;

public class Rectangle implements Shape {
    public double width;
    public double length;

    Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }

    public Rectangle() {
    }
    @Override
    public double area(){
        return width*length;
    }
    @Override
    public double surface(){
        return (width+length)*2;
    }
}
