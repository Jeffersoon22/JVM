public abstract class task7 {
    public static void TaskSeven(){
        int a =170,b=408;
        int GCDResult = GCD(a,b);
        int LMCResult = LCM(a,b);
        System.out.format("GCD of %d and %d is: %d\n",a,b,GCDResult);
        System.out.format("LCM of %d and %d is: %d\n",a,b,LMCResult);
    }
    public static int GCD(int a,int b){
        a=a>0?a:-a;
        b=b>0?b:-b;

//        ზუსტად არ მახსოვს რომელია აქედან ევკლიდეს ფორმულა
//        while(a!=b){
//            if(a>b) a-=b;
//            else b-=a;
//        }
//        return a;

        while(a*b!=0){
            if(a>b)a%=b;
            else b%=a;
        }
        return a+b;
    }
    static int LCM(int a,int b){
        return a * b / GCD(a,b);
    }
}
