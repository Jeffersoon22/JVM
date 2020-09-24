import java.util.Scanner;

public class task2 {
    static void TaskTwo() {
        Scanner sc;
        int number1,number2;
        System.out.print("input first number: ");
        sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.print("input second number: ");
        number2 = sc.nextInt();
        int result,result2;
        result = number1/number2;
        System.out.format("Division of %d and %d is: %d",number1,number2,result);
        result2 = number2 % number1;
        System.out.format("\nRemains of %d and %d is: %d\n",number2,number1,result2);

    }
}
