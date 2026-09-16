// ARRAYS:

import java.util.Scanner;

public class Array {
   
  // Code optimized.
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int[] marks = new int[3];
      marks[0] = 95; // physics
      marks[1] = 97; // chemistry
      marks[2] = 98; // english
        
System.out.println("YOUR PHYSICS MARKS ARE :");
System.out.println(marks[0]);

 System.out.println("YOUR CHEMISTRY MARKS ARE :");
  System.out.println(marks[1]);

  System.out.println("YOUR ENGLSIH MARKS ARE :");
    System.out.println(marks[2]);

        sc.close();
    }
 }
