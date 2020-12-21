package Classes;

import Interfaces.IClassA;

public class classA implements IClassA {
    int a;
    int b;

    public classA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void ReturnNumbersBetween(int a, int b) {
        System.out.print("Numbers between a and b:\t");
        for (int i=Math.min(a,b);i<Math.max(a,b);i++){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    @Override
    public void ReturnADividers(int a) {
        System.out.print("Dividers of a:\t");
        for (int i =1;i<=a;i++){
            if (a%i==0) System.out.print(i+"\t");
        }
        System.out.println();
    }

    @Override
    public void ReturnBSimpleDividers(int b) {
        System.out.print("Simple dividers of b:\t");
        for (int i=1;i<=b;i++){
            int dividersOfDividers=0;
            if (b%i==0){
                for (int x=1;x<=i;x++){
                    if(i%x==0) {
                        dividersOfDividers++;
                        if (dividersOfDividers > 2) {
                            dividersOfDividers = 0;
                            break;
                        }
                    }
                }
                if (dividersOfDividers==2){
                    System.out.print(i+"\t");
                }
            }
        }
    }

    @Override
    public void ReturnModNumberFromB(int b) {
        System.out.println();
        String bToString = String.valueOf(b);
        char actionCharacter = ' ';
        char[] bCharacters = bToString.toCharArray();
        int action=0;
        int mode=0;
        for(char i:bCharacters){
            for (char x : bCharacters){
                if (x==i){
                    action++;
                }
            }
            if (action!=1){
                if (action>mode){
                    actionCharacter=i;
                    mode=action;
                }
            }
            if (action==0){
                System.out.println("there are not same characters");
            }
            action=0;
        }
        if (mode>0){
            System.out.format(mode + " is count of '%s' in %d number",actionCharacter,b);
        }
        else System.out.format("there are not same characters in %d",b);
    }

    @Override
    public void CallAllVoids() {
        ReturnNumbersBetween(a,b);
        ReturnADividers(getA());
        ReturnBSimpleDividers(getB());
        ReturnModNumberFromB(getB());
    }
}
