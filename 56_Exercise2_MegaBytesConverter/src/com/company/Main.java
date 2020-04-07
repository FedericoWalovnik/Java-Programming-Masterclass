package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes>=0) {
            int megaBytes = kiloBytes / 1024;
            int restKiloBytes =  kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB" );
        }else{
            System.out.println("Invalid Value");
        }
    }
}
