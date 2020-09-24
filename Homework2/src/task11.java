import java.util.Arrays;
import java.util.Scanner;

public class task11 {
    public static void TaskEleven(){
        int[] numbers = new int[8];
        for (int i=0;i<8;i++){
            System.out.format("Input number by serial number %d for an array: ",i+1);
            int inputNumbers = new Scanner(System.in).nextInt();
            numbers[i] = inputNumbers;
        }
        System.out.print("\nElements of array:\t");
        for (int number : numbers) {
            System.out.print(number+ "\t");
        }

    }
}
