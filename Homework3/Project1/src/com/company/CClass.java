package com.company;

import java.util.Scanner;

public class CClass {
    int a;
    int b;
    int c;
    int sum = 0;
    void GetValues(){
        Scanner inputtedValue = new Scanner(System.in);
        System.out.print("Input value for a: ");
        a = inputtedValue.nextInt();
        System.out.print("Input value for b: ");
        b = inputtedValue.nextInt();
        System.out.print("Input value for c: ");
        c = inputtedValue.nextInt();
    }

    int GetLastOfa(){
        return  a % 10;
    }

    int GetFirstOfb(){
        while(b >10){
            b/=10;
        }
        return b;
    }
    int SumOfC(){
        while(c!=0){
            sum+=c%10;
            c/=10;
        }
        return sum;
    }

    int MultiplyOfFirstAndSecond(){
        int lastOfA = GetLastOfa();
        int firstOfB = GetFirstOfb();
        System.out.format("The multiply first and second void is: %d\n",lastOfA * firstOfB);
        return lastOfA * firstOfB;
    }

    int MultiplyOfSumCAndFirstLast(){
        int firstOfB = GetFirstOfb();
        int multiplyFirstAndLast = MultiplyOfFirstAndSecond();
        System.out.println(firstOfB + multiplyFirstAndLast);
        return firstOfB + multiplyFirstAndLast;
    }
}
