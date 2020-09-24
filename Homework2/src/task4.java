import java.util.Scanner;

public class task4 {
    static void TaskFour(){
        System.out.print("Input three-digit number: ");
        Scanner sc;
        String inputtedString;
        sc = new Scanner(System.in);
        inputtedString = sc.nextLine();
        int inputtedInteger = Integer.parseInt(inputtedString);
        if (99< inputtedInteger && inputtedInteger < 1000 || inputtedString.equals("000"))
        {   for (int i=0;i<3;i++)
            {
                System.out.format("%d number of your inputted number is: ",i+1).print(inputtedString.charAt(i)+"\n");
            }
        }
    }
}
