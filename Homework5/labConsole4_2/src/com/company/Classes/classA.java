package com.company.Classes;

import java.util.Arrays;
import java.util.Random;

public class classA {
    int a,b;
    int[] m = new int[12];

    public void SetAAndBValues(){
        Random random = new Random();
        a = random.nextInt(25-10)+10;
        b = random.nextInt(25-10)+10;
    }
    //აქ ვერ მივხვდი დაბურნებაში ფუნქცია უნდა დამეწერა რომელიც
    //დაბეჭდავდა თუ უბრალოდ public int - return უნდა გამეკეთებინა

    public void ReturnAAndB(){
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
    }
    // ამოცანაში პირობა არის არეული მეორე აბრინებს ა და ბ ცვლდების შესაბამის სიმბოლოებს
    public void GetValuesToMMassive(){
        Random random = new Random();
        for (int i=0; i < m.length; i++){
            m[i] = random.nextInt(60-(-10))+(-10);
        }

    }
    public void PrintEvenNumbers(){
        System.out.print("Even numbers in array are:"+"\t");
        for (int i=0; i < m.length; i++){
            if (m[i] % 2==0){
                System.out.print(m[i]+"\t");
            }
        }
        System.out.println();
    }
    public void PrintSumOfPositiveNumbers(){
        int sum=0;
        for (int i=0; i < m.length; i++){
            if (m[i] >0){
                sum+=m[i];
            }
        }
        System.out.println("Sum of positive numbers from array:\t"+sum);
    }
    public void MinPositiveValue(){
        int minValue = Arrays.stream(m).max().getAsInt();
        for (int i=0;i<m.length;i++){
           if (minValue>m[i] && m[i]>0){
               minValue=m[i];
           }
        }
        System.out.println("Min positive number in array:\t"+minValue);
    }
    public void CallAllVoids(){
        SetAAndBValues();
        ReturnAAndB();
        GetValuesToMMassive();
        PrintEvenNumbers();
        PrintSumOfPositiveNumbers();
        MinPositiveValue();
    }
}
