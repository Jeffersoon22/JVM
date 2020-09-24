import java.util.Arrays;

public class task10 {
    public static void TaskTen(){
        int[] numbers = {945,749,65,485,356,198,52,1};
        System.out.print("Elements of array:\t");
        for (int number : numbers) {
            System.out.print(number+ "\t");
        }
        Arrays.sort(numbers);
        System.out.print("\nElements of array (sorted):\t");
        for (int number : numbers) {
            System.out.print(number+ "\t");
        }
    }
}