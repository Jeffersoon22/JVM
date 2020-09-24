import java.util.Scanner;

public class task5 {
    static void TaskFive(){
        System.out.print("Input four-digit number: ");
        Scanner sc;
        String inputtedString = new Scanner(System.in).nextLine();
        try{
            int inputtedInteger = Integer.parseInt(inputtedString);
            int sum =0;
            if (999< inputtedInteger && inputtedInteger < 10000 || inputtedString.equals("0000")) {
                for (int i=0;i<4;i++) {
                        sum = sum+ Integer.parseInt(String.valueOf(inputtedString.charAt(i)));
                    }
                System.out.format("Sum of your inputted numbers digit is: %d\n",sum);
            }
            else{
                System.out.println("Number is lower or higher...");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
