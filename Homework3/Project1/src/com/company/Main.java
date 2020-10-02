package com.company;
public class Main {

    public static void main(String[] args) {
        // write your code here
        AClass a = new AClass();
        a.GetValues();
        a.GetSum();
        a.Multiply();

        BClass b = new BClass();
        b.GetValues();
        b.MaxValue();
        b.MinValue();

        CClass c = new CClass();
        c.GetValues();
        c.GetLastOfa();
        c.GetFirstOfb();
        c.SumOfC();
        c.MultiplyOfFirstAndSecond();
        c.MultiplyOfSumCAndFirstLast();
    }
}
