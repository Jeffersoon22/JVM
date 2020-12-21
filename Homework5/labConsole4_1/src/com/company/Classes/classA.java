package com.company.Classes;

public class classA {
    int a = 10;
    int b = 29;
    public void printHelloWorld(){
        System.out.print("Hello OOP");
        System.out.println();
    }
    public void getA(){
        System.out.print("Value of a: "+a);
        System.out.println();
    }
    public void getB(){
        System.out.print("Value of b: "+b);
        System.out.println();
    }
    public void getSumOfAAndB(){
        System.out.print("a + b = " + (a+b));
        System.out.println();
    }
    public void getMultiplyAAndB(){
        System.out.print("a * b = "+a*b);
        System.out.println();
    }
    public void resetAAndB(){
        a=5;
        b=6;
        System.out.print("now a is equal to "+a);
        System.out.println();
        System.out.print("now b is equal to "+b);
        System.out.println();
    }
    public void callAllVoids(){
        printHelloWorld();
        getA();
        getB();
        getSumOfAAndB();
        getMultiplyAAndB();
        resetAAndB();
    }
}
