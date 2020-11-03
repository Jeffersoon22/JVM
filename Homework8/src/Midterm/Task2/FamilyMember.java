package Midterm.Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyMember extends Thread{
    private String name;
    private String lastName;
    private int age;
    private String status;
    private FamilyBudget budget;
    private int amount;

    public FamilyMember(){

    }
    public FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        SaveInfoAboutFamily();
    }

    public void SaveInfoAboutFamily(){
        File aboutFamily = new File("family.txt");
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(aboutFamily,true));
            bf.write("Family member is:\t"+name+"\t"+lastName+"\t"+age+"\t"+status+"\n");
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SetBudget(FamilyBudget budget){
        this.budget = budget;
    }

    public void SetAmount(int amount){
        this.amount = amount;
    }

    private void TakeMoney(){
        budget.ChangeMoney(amount);
        System.out.println(name+"\t"+this.getName()+"\t"+budget.GetMoney());
    }

    public void run(){
        TakeMoney();
    }
}
