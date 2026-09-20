// 7) WRITE A PROGRAM TO ENTER THE NUMBERS TILL THE USER WANTS AND RETURN 
// THE NO OF COUNTS OF POSITIVE ,NEGATIVE ,AND ZEROS ENTERED :

// Importing Scanner Class :

import java.util.Scanner;

public class Basic{

    // Main Method :
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int positivecount = 0;
       int negativecount = 0;
       int zerocount = 0;
       char choice = 0;

//    Looping Statements :

       do{
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

//    Conditional Statements:

        if(num>0){
            positivecount ++; // increases positive numbers count.
        } else if (num<0){
            negativecount ++; // increases negative numbers count.
        }else{
            zerocount ++;  // increases zeros count.
        }

        System.out.println("Do you want to enter more numbers?(y/n):");
        choice = sc.next().charAt(0);
       } while(choice == 'y' || choice == 'Y');

//    Print Statements :

       System.out.println("\nFinal counts");
       System.out.println("Positive numbers:"+" " +positivecount);
       System.out.println("Negative numbers:"+" "+negativecount);
       System.out.println("Zero count:"+" "+zerocount);
    
       sc.close();
    }
}
