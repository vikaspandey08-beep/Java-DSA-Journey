// StringBuilder in java:

import java.util.Scanner;

public class Stringbuilder {
public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder("Vikas");
         System.out.println(sb);

         System.out.println(sb.charAt(0));

// set char at 0:
        sb.setCharAt(0,'B');
         System.out.println(sb);

         sb.setCharAt(5,'h');
         System.out.println(sb);

// insert element at index:
         sb.insert(0,'S');
        System.out.println(sb);

//   delete the extra added 'S' :
         sb.delete(0,1);
         System.out.println(sb);

//  append the new letters:
         sb.append(" ");
         sb.append("P");
         sb.append("a");
         sb.append("n");
         sb.append("d");
         sb.append("e");
         sb.append("y");
         System.out.println(sb);

// .length function for StringBuilder in java:
         sb.append(" ");
         sb.append("P");
         sb.append("a");
         sb.append("n");
         sb.append("d");
         sb.append("e");
         sb.append("y");
        System.out.println(sb.length());

 //  Reverse a string in StringBuilder in java:
         for(int i=0;i<sb.length()/2;i++){
             int front = i;
             int back = sb.length()-1-i;
             char frontChar = sb.charAt(i);
             char backChar = sb.charAt(back);

             sb.setCharAt(front, backChar);
             sb.setCharAt(back, frontChar);
         }
         System.out.println(sb);
         sc.close();
    }
}
