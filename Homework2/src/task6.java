import java.util.Scanner;

public class task6 {
    static void TaskSix(){
        System.out.print("Input any number: ");
        Scanner sc;
        sc = new Scanner(System.in);
        int sum =0;
        try {
            int inputtedInteger = Integer.parseInt(sc.nextLine());
            while(inputtedInteger != 0){
                sum+=inputtedInteger%10;
                inputtedInteger /=10;
            }
            System.out.format("Sum of your inputted numbers digit is: %d\n",sum);
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
