package Midterm.Task2;

public interface IFamilyBudget {
    void SetMoney(int money);
    int GetMoney();
    void ChangeMoney(int amount);
    String Status();
    void CallAllVoids(int money,int amount);
    void SaveInfoAboutBudget();
}
