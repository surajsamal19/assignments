package com.bridgelabflipcoin;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        int headCount=0,tailCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of times you want to flip the coin:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            double random = Math.random();
            if (random < 0.5) {
                tailCount++;
                System.out.println("Tails");
            } else {
                headCount++;
                System.out.println("Heads");
            }
        }

    }
}
