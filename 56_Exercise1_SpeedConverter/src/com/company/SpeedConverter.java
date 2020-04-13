package com.company;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesToReturn = -1;

        if (kilometersPerHour >= 0){
            milesToReturn = Math.round(kilometersPerHour*0.621371);
        }

        return milesToReturn;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
