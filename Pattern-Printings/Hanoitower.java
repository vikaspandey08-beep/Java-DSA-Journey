// Tower of Hanoi :
    
 import java.util.Scanner;

 public class Hanoitower {
    public static void towerofHanoi(int n,String src,String help,String des){
        if(n == 1){
            System.out.println(" Transfer disk " + n + " from "+ src + " to "+ des);
            return;
        }
      towerofHanoi(n-1,src,des,help);
      System.out.println(" Transfer disk " + n + " from "+ src + " to "+ des);
      towerofHanoi(n-1,help,src,des);
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n  = 3;
        towerofHanoi(n,"S" ,"H","D");
        sc.close();
    }
}

