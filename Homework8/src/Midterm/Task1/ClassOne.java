package Midterm.Task1;

import java.util.Random;
import java.util.Scanner;

public class ClassOne implements IClassOne{
    int[] m = new int[15];

    @Override
    public void GetValues() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Input value for a:");
            int a = sc.nextInt();
            System.out.print("Input value for a:");
            int b = sc.nextInt();
            Random random = new Random();
            for (int i = 0; i<15; i++){
                m[i] = random.nextInt((b-a)+a+1);
            }
            System.out.println("Massive:\t");
            for (int i:m)System.out.print(i +"\t");
            System.out.println("\n");
        }
        catch (Exception e){
            System.out.println("Inputted value is not integer...");
            GetValues();
        }
    }

    @Override
    public int SumOfValuesHigherThanIndex() {
        int index = 0;
        int sum = 0;
        for (int i:m) {
            sum += index > i? i:0;
            index++;
        }
        System.out.println("Sum of numbers:" + sum);
        return sum;
    }

    @Override
    public int MultiplyOfElementsHigherThanIndex() {
        int multiply = 1;
        int index = 0;
        for (int i: m) {
            multiply *= i > index? index:1;
            index++;
        }
        System.out.println("Multiply of index:\t"+ multiply);
        return multiply;
    }

    @Override
    public void GetEvenNumbers() {
        System.out.println("Even numbers:");
        for (int i:m) {
            if (i % 2 == 0){
                System.out.print(i + "\t");
            }
        }
    }

    @Override
    public void CallAllVoids() {
        GetValues();
        SumOfValuesHigherThanIndex();
        MultiplyOfElementsHigherThanIndex();
        GetEvenNumbers();
    }
}
