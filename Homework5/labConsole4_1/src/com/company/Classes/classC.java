package com.company.Classes;

import java.util.Scanner;

public class classC {
    int a = 10;
    int b = 9;
    char s = '#';
    char h = '@';

    public void getAAndB() {
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
    }

    public void getSymbols() {
        System.out.println("S iz: " + s);
        System.out.println("H iz: " + h);
    }

    public void getResults() {
        System.out.println("Sum of a and b: "+(a+b));
        System.out.println("Multiply of a and b: "+(a*b));
        System.out.println("Subtract balance of a and b: "+(a%b));
    }
    public void resetAFromUser(){
        System.out.print("Input value for a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Value of a: " +a);
    }
    public void resetBFromUser(){
        System.out.print("Input value for b: ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        System.out.println("Value of b: " +b);
    }
    public void resetSFromUser(){
        System.out.print("Input value for s: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next().charAt(0);
        System.out.println("Value of s: " +s);
    }
    public void resetHFromUser(){
        System.out.print("Input value for h: ");
        Scanner sc = new Scanner(System.in);
        h = sc.next().charAt(0);
        System.out.println("Value of h: " +h);
    }

    public void callAllVoids(){
        getAAndB();
        getSymbols();
        getResults();
        resetAFromUser();
        resetBFromUser();
        resetSFromUser();
        resetHFromUser();
    }
}
