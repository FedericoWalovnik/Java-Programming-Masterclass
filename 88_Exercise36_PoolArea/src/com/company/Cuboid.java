package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0) {
            this.height = 0;
        }

        this.height = height;
    }

    public double getVolume(){
        double volumen = 0;
        volumen = getArea()*height;
        return volumen;
    }
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }
}
