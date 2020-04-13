package com.company;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes>=0){
            int restMinutes = (int) minutes%60;
            minutes = minutes - restMinutes;

            int hours = (int)  minutes/60;
            int days = hours/24;
            int years = days/365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");

        }else{
            System.out.println("Invalid Value");
        }

    }
}
