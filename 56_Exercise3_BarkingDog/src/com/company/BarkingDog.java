package com.company;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if(hourOfDay>=0 && hourOfDay<24) {
            if ((hourOfDay < 8 || hourOfDay > 22) && (barking == true)) {
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}
