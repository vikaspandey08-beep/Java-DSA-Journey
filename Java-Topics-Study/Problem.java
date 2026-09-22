// Print a string in reverse in normal form:

 import java.util.Scanner;

public class Problem{ 
    public static String reverseString(String str){
      if(str == null || str.isEmpty()){
        return str;
      }
      StringBuilder reversed = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
      }
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original = "Tony Stark";
        String reversed = reverseString(original);

        System.out.println("original String :"+" "+ original);
        System.out.println("reversed String :"+" "+ reversed);

    sc.close();
    }
}

