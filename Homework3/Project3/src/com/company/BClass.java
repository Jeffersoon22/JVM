package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class BClass {
    int[] m = new int[12];
    Random random = new Random();
    void GetValuesFromConsole(){
        Scanner inputtedValue = new Scanner(System.in);
        for (int i=0;i<12;i++){
            System.out.format("Input %d value for an array: ",i+1);
            m[i] = inputtedValue.nextInt();
        }
    }
    void GetValuesWithRandom(){
        for(int i=0;i<12;i++){
            m[i] = random.nextInt(15);
        }
    }
    void HigherThanSeven(){
        int counter=0,sum=0;
         for (int elem: m) {
             if (elem > 7){
                 System.out.format("element's value is %d and its index is %d\n",elem,counter);
             }
             counter++;
         }
    }

    int DifferenceMinMax(){
        System.out.println(Arrays.stream(m).max().getAsInt() - Arrays.stream(m).min().getAsInt());
        return Arrays.stream(m).max().getAsInt() - Arrays.stream(m).min().getAsInt();
    }
}
