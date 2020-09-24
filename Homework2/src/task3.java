import java.util.Scanner;

public class task3 {
    static void TaskThree(){
        Scanner sc;
        int number1,number2,number3;
        System.out.print("input first number: ");
        sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.print("input second number: ");
        number2 = sc.nextInt();
        System.out.print("input third number: ");
        number3 = sc.nextInt();
        int sumResult = number1 + number2 + number3;
        int multiplyResult = number1 * number2 * number3;
        System.out.format("Sum is: %d",sumResult);
        System.out.println();
        System.out.format("Multiply is: %d\n",multiplyResult);
    }
}
