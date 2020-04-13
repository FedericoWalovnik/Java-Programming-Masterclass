package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int originalNumber=number, sum=0;

        if(number>=0){
            while(number != 0){
                int actualDigit = number%10;
                number /= 10;
                if((actualDigit%2)==0){
                    sum += actualDigit;
                }
            }
        }else{
            sum=-1;
        }
        return sum;
    }
}
