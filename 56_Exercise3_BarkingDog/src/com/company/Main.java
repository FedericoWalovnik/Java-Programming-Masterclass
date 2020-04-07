package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean b = shouldWakeUp (true, 1);
        System.out.println(b);

        b = shouldWakeUp (false, 2);
        System.out.println(b);

        b =  shouldWakeUp (true, 8);
        System.out.println(b);

        b = shouldWakeUp (true, -1);
        System.out.println(b);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if(hourOfDay>=0) {
            if ((hourOfDay < 8 || hourOfDay > 22) && (barking == true)) {
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}
