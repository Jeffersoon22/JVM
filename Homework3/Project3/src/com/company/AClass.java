package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AClass {
    int[] m = new int[10];
    Random random = new Random();
    void GetValuesFromConsole(){
        Scanner inputtedValue = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.format("Input %d value for an array: ",i+1);
            m[i] = inputtedValue.nextInt();
        }
    }
    void GetValuesWithRandom(){
       for(int i=0;i<10;i++){
           m[i] = random.nextInt(15);
       }
    }
    int GetSpecialElements(){
        int counter = 0,sum =0;
        for (int elem: m) {
            if (counter > elem){
                sum+=elem;
            }
            counter++;
        }
        System.out.println(sum);
        return sum;
    }
    int MultiplyOfElements(){
        int counter =0,multiply=1;
        for(int elem:m){
            if(counter<elem){
                multiply*=counter;
            }
            counter++;
        }
        System.out.println(multiply);
        return  multiply;
    }
}
