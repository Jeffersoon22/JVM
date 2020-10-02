package com.company;

import java.util.Scanner;

public class AClass {
    int a;
    int b;
    void GetValues(){
        Scanner inputtedValue= new Scanner(System.in);
        System.out.print("Input value for a: ");
        a = inputtedValue.nextInt();
        System.out.print("Input value for b: ");
        b = inputtedValue.nextInt();
    }

    int GetSum(){
        System.out.println(a + b);
        return a + b;
    }

    int Multiply(){
        System.out.println(a * b);
        return a * b;
    }
}
