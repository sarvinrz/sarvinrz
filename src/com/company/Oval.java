package com.company;

import com.company.Shape;

public class Oval implements Shape {
    public double radius;
    protected final double pi=3.14;
    public Oval(double radius){
        this.radius=radius;
    }

    public Oval() {
    }

    @Override
    public double area(){return 2*pi*radius;};
    @Override
    public double surface(){
        return pi*radius*radius;
    }

}
