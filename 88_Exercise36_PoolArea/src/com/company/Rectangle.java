package com.company;

public class Rectangle {
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            this.width=0;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            this.length=0;
        }
        this.length = length;
    }

    public double getArea(){
        double area = 0;
        area = length*width;
        return area;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
