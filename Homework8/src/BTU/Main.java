package BTU;

import Midterm.Task1.ClassOne;
import Midterm.Task2.FamilyBudget;
import Midterm.Task2.FamilyMember;
import java.io.File;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("----------"+"\nTask 1\n"+"----------");
        ClassOne a = new ClassOne();
        a.CallAllVoids();
        System.out.println("\n----------"+"\nTask 2\n"+"----------");
        DeleteFiles();
        FamilyBudget budget = new FamilyBudget();
        budget.SetMoney(30000);
        FamilyMember member1 = new FamilyMember("Nina","Jija",22,"Mom");
        FamilyMember member2 = new FamilyMember("Dida","Hiha",22,"Son");
        FamilyMember member3 = new FamilyMember("Wiwa","Nina",22,"Dog");
        member1.SetBudget(budget);
        member2.SetBudget(budget);
        member3.SetBudget(budget);
        Random random = new Random();
        member1.SetAmount(random.nextInt(300));
        member2.SetAmount(random.nextInt(200));
        member3.SetAmount(random.nextInt(100));
        member1.start();
        member2.start();
        member3.start();
    }

    private static void DeleteFiles() {
        File aboutBudget = new File("budget.txt");
        if (aboutBudget.isFile()) {
            aboutBudget.delete();
        }
        File aboutFamily = new File("family.txt");
        if (aboutFamily.isFile()) {
            aboutFamily.delete();
        }
    }
}