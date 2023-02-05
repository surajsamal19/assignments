package com.bridgelab.flipcoinpercentage;

import java.util.Scanner;

public class Flipcoinpercentage {
    public static void main(String[] args) {
            System.out.println("The coin percentage Calculation problem are");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of  times you want to flip the coin :");
        int totalFlip=sc.nextInt();
        int headFlip=0;
        int tailFlip=0;
        if (totalFlip>0) {
        for (int i=1;i<=totalFlip;i++) {
        double flip=Math.floor(Math.random()*10)%2;
        if (flip<0.5) {
        headFlip++;

        }
        else {
        tailFlip++;
        }
        }

        }
        else {
        System.out.println("THe value Entered is not Positive value");
        System.exit(0);
        }
        double headPercent=(headflip*100)/totalFlip;
        double tailPercent=(tailflip*100)/totalFlip;
        System.out.println("Head flip percentage is : "+headPercent);
        System.out.println("Tail flip percentage is : "+tailPercent);
        }
}


