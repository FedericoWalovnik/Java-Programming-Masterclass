package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sumOdd(10,20));
    }

    public static boolean isOdd(int number){
        boolean odd = false;
        if(number>0){
            if((number%2)!=0){
                odd = true;
            }
        }
        return odd;
    }

    public static int sumOdd(int start, int end){
        int sum=-1;
        if(start>0&&end>0&&end>=start){
            sum = 0;
            for(int i=start; i<=end;i++){
                if(isOdd(i)){
                    sum=sum+i;
                }
            }
        }
        return sum;
    }

}
