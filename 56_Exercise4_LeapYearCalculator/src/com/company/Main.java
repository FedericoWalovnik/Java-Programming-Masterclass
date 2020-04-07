package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //should return true
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));

        //should return false
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(2017));
    }

    public static boolean isLeapYear(int year){
        boolean valueReturn = false;
        if(year >= 1 && year<=9999){
            if ((year%4)==0){
                if ((year%100)==0){
                  if ((year%400)==0){
                      valueReturn=true;
                  }else {
                      valueReturn=false;
                  }
                } else {
                    valueReturn=true;
                }
            }
        }
        return valueReturn;
    }
}
