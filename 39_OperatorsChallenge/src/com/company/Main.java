package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double multiplyValues = 100d * (firstValue + secondValue);
        double reminder = multiplyValues % 40;
        boolean isZero = (reminder == 0 )? true: false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("is not zero");
        }
    }
}
