import java.util.Arrays;

public class task9 {
    public static void TaskNine(){
        int[] numbers = {59,48,25,16,5,79,35,984};

        System.out.print("Elements of array:\t");
        for (int number : numbers) {
            System.out.print(number+ "\t");
        }
        System.out.format("\nMin value in array is: %d",Arrays.stream(numbers).min().getAsInt());
        System.out.format("\nMax value in array is: %d",Arrays.stream(numbers).max().getAsInt());
    }
}
