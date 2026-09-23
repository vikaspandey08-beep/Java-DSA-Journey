// Print sum of first n natural numbers :

// Importing Scanner Class :
import java.util.Scanner;

public class Push {
        public static void printSum(int i,int n,int sum){
                if(n == i){
                        sum += n;
                        System.out.println(sum);
                        return;
                }
                sum += i;
                printSum(i+1,n,sum);
                System.out.println("Your value of i in each level of stack is given below :");
                System.out.println(i);
        }
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Your entered sum of natural numbers is :");
                printSum(1,5,0);
       sc.close();
 }
}