// Recursion and its problems  :
// Series from 5 to 1 :

import java.util.Scanner;

public class Recursion1{
        public static void printNumbers(int n){
           if(n == 0){
                return;
           }
                System.out.println(n);
                printNumbers(n-1);
        }
        public static void main(String[] args){
                Scanner sc =  new Scanner(System.in);
                int n = 5;
                System.out.println("Your Number Series is :");
                printNumbers(n);
                sc.close();
        }
}

