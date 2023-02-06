package com.bridgelabgamblingproblem;

public class GamblingProblem {

    public static int STAKE = 100;
    public static int BET = 1;

    public static void main(String[] args) {

    System.out.println("THe gambling simulation problem are");
    winOrloose(); // calling method
}

    public static void winOrloose() {

        int check = (int) Math.floor((Math.random() * 10) % 2);
        if (check == 0) {
            STAKE++;
            System.out.println("The gambler won");
        } else {
            STAKE--;
            System.out.println("The Gambler loose");
        }
        System.out.println("stake value is: " +STAKE);
    }
}

