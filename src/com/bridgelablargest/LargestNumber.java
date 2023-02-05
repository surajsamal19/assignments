package com.bridgelablargest;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        int a,b,c,largest;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first  number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        System.out.print("Enter third  number:");
        c=sc.nextInt();

        if ( a>b && a>c )
            largest=a;
        else if ( b>a && b>c )
            largest=b;
        else
            largest=c;

        System.out.println("Largest Number is : "+largest);

    }
}



