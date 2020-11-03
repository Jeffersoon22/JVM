package Midterm.Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget implements IFamilyBudget{
    private int money;

    public void SetMoney(int money){
        this.money = money;
        SaveInfoAboutBudget();
    }
    public int GetMoney(){
        return money;

    }
     synchronized public void ChangeMoney(int amount){
        if (GetMoney() > amount){
            money -= amount;
        }
        else System.out.println("Not money in the budget...");
        SaveInfoAboutBudget();
    }

    @Override
    public String Status() {
        return  money < 10000? "Poor" : money < 40000? "Medium" : "Rich";
    }

    @Override
    public void CallAllVoids(int money,int amount) {
        SetMoney(money);
        GetMoney();
        ChangeMoney(amount);
        Status();
    }

    @Override
    public void SaveInfoAboutBudget() {
        File budgetInfo = new File("budget.txt");
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(budgetInfo,true));
            bf.write("Family budget at this moment is:\t" + money + "\n");
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
