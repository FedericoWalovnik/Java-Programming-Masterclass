package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteNumber = 54;
        short shortNumer = 34;
        int intNumber = 345;
        int sumOfNumbers = byteNumber + shortNumer + intNumber;
        long longNumber = 50000L + (sumOfNumbers*10);

        System.out.println(longNumber);

    }
}
