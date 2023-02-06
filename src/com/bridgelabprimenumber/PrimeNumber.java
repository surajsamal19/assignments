package com.bridgelabprimenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

            boolean isPrime=true;
            int num;
            System.out.println("Enter the number other want to print");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            if(num!=0 || num!=1) {
                for(int i=2;i<num/2;i++) {
                    if(num%i==0) {
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.println("Prime number");
                else
                    System.out.println("Not prime number");
            }
            else
                System.out.println("Enter valid number");
        }

    }



