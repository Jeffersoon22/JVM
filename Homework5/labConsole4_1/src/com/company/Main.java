package com.company;

import com.company.Classes.classA;
import com.company.Classes.classB;
import com.company.Classes.classC;

public class Main {

    public static void main(String[] args) {
        classA a = new classA();
        a.callAllVoids();
        classB b = new classB();
        b.callAllVoids();
        classC c = new classC();
        c.callAllVoids();
    }
}
