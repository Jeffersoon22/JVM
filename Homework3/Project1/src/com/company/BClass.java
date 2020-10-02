package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BClass {
    int a;
    int b;
    int c;
    int[] numbers = new int[3];
    void GetValues(){
        Scanner inputtedValue= new Scanner(System.in);
        System.out.print("Input value for a: ");
        a = inputtedValue.nextInt();
        System.out.print("Input value for b: ");
        b = inputtedValue.nextInt();
        System.out.print("Input value for c: ");
        c = inputtedValue.nextInt();
        numbers[0] = a;
        numbers[1] = b;
        numbers[2] = c;
    }

    int MaxValue(){
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        return Arrays.stream(numbers).max().getAsInt();
    }

    int MinValue(){
        System.out.println(Arrays.stream(numbers).min().getAsInt());
        return Arrays.stream(numbers).min().getAsInt();
    }
}
