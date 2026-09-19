//Print the x raise to the power n (Stack height = n) :

import java.util.Scanner;

public class Recursion2{
    public static int calcPower(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
       int xPowern = calcPower(x,n-1);
       int xpow = x* xPowern;
       return xpow;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int x = 2;
        int n = 5;
        int ans =  calcPower(x,n);
        System.out.println("Your Output is :");
        System.out.println(ans);
     sc.close();
    }
}
