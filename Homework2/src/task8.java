import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;

public class task8 {
    public static void TaskEight(){
        Scanner sc;
        System.out.print("Input number M: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Input number N: ");
        int n = new Scanner(System.in).nextInt();
        PrintMtoN(m,n);
    }
    static void PrintMtoN(int a,int b){
        double random = a;
        System.out.format("Integers between %d and %d are:\t",a,b);
        while(random < b){
            System.out.print((int)random + "\t");
            random++;
        }
    }
}
