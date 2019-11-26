/*
initial thought version
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(F(5));

    }

    public static int FR(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return F(n - 1) + F(n-2);
    }


    // F(n) = F(n-1) + F(n-2)
    public static int F(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int fnMinus1 = 1;
        int fnMinus2 = 0;
        int temp;
        for(int i = 2; i < n; i++) {
            temp = fnMinus1;
            fnMinus1 = fnMinus1 + fnMinus2;
            fnMinus2 = temp;
        }
        return fnMinus1 + fnMinus2;
    }
}
