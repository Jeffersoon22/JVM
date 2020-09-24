import java.util.*;
import java.util.Collections;
public class task12 {
    public static void TaskTwelve(){
        Integer[] numbers = new Integer[8];
        for ( int i = 0; i < 8 ; i++ ){
            System.out.format("Input number by serial number %d for an array: ",i+1);
            int inputNumbers = new Scanner(System.in).nextInt();
            numbers[i] = inputNumbers;
        }
        System.out.print("\nElements of array:\t");
        for (int number : numbers) {
            System.out.print(number+ "\t");
        }
        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.print("\nElements of array sorted descending order:\t");
        for (int number : numbers) {
            System.out.print(+number+ "\t");
        }
    }
}

