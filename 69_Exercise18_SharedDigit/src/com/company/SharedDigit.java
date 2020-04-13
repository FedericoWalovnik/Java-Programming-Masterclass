package com.company;

public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int number1, int number2){
        boolean sharedDigit=false;
        if(number1>=10&&number1<=99&&number2>=10&&number2<=99){
            int num=number1, num2=number2;

            while(num != 0){
                int toCompare = num%10;
                num2 = number2;
                while(num2 !=0){
                    if(toCompare==(num2%10)){
                        sharedDigit=true;
                    }
                    num2 /= 10;
                }
                num /= 10;
            }
        }
        return sharedDigit;
    }
}