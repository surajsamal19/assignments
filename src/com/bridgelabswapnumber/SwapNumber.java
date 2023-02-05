package com.bridgelabswapnumber;

public class SwapNumber {
    public static void main(String[] args) {
        float first = 1.5f ,second = 2.5f;
        System.out.println("--Before swap--");
        System.out.println("First Number" +first);
        System.out.println("Second Number" +second);
        float temporary = first;
        first = second;
        second = temporary;
        System.out.println("--After swap--");
        System.out.println("First number =" + first);
         System.out.println("Second number =" + second);


    }

}
