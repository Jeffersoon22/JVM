package com.company.Classes;

import java.util.Random;
import java.util.Scanner;

public class classB {
    int a = 33;
    double b = 9.7;
    char s = '#';
    public void getS(){
        System.out.println("S is: "+s);
    }
    public void getA(){
        System.out.println("Value of a: "+a);
    }
    public void getB(){
        System.out.println("Value of b: "+b);
    }
    public void getSubtract(){
        System.out.println("a - b = "+(a-b));
    }
    public void getDivision(){
        System.out.println("a / b = "+(a/b));
    }
    public void resetAAndB(){
        Random random = new Random();
        a = random.nextInt();
        System.out.println("Now a is equal to " + a);
        b = random.nextDouble();
        System.out.println("Now b is equal to " + b);
    }
    public void resetAFromUser(){
        System.out.print("Input value for a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Value of a: " +a);
    }
    public void getAddedB(){
        b += 10;
        System.out.println("Value of b: "+b);
    }
    public void callAllVoids(){
        getS();
        getA();
        getB();
        getSubtract();
        getDivision();
        resetAAndB();
        resetAFromUser();
        getAddedB();
    }
}
