// Project ATM Simulator:

import java.util.Scanner;

public class Project{
      static double balance = 5000.33;
      static int correctPin = 8888;
      static String history = "";
      static Scanner sc = new Scanner(System.in);
     public static void main(String[] args){
        System.out.println("======================================");
        System.out.println("    Welcome to Java ATM Simulator     ");
        System.out.println("======================================");

        if(verifyPin(3)){
          showMenu();
        }else{
            System.out.println("\nToo many Attempts !Card Blocked.");
        }
    }
    public static boolean verifyPin(int attempts){
        if(attempts == 0){
            return false;
        }
        System.out.println("Enter your 4 digit pin :");
        int enteredPin = sc.nextInt();
        
        if(enteredPin == correctPin){
            System.out.println("Pin verified Successfully!");
            return true;
        }else{
            System.out.println("Incorrect Pin! Attempts left :"+" "+(attempts-1));
            return verifyPin(attempts-1);
        }
    }
    public static void showMenu(){
        int choice;
        do{
            System.out.println("\n-----------------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    checkBalance();
                    break;
                    case 2:
                        deposit();
                        break;
                        case 3:
                            withdraw();
                            break;
                            case 4:
                                showMiniStatement();
                                break;
                                case 5:
                                    System.out.println("Thank you for using JAVA ATM. Goodbye!");
                                    break;
                                    default:
                                        System.out.println("Invalid choice!Please Select 1-5.");
            }
        }while(choice!=5);
            }
            public static void checkBalance(){
                System.out.println("Your current Balance is Rs:"+" "+balance);
            }
            public static void deposit(){
                System.out.println("Enter the amount you want to deposit:");
                double amount = sc.nextDouble();

                
                if(amount>0){
                    balance += amount;
                    history += "Deposited:"+ amount +"\n";
                    System.out.println("Successfully Deposited"+" "+ amount);
                    System.out.println("Updated Balance"+" "+ balance);
                }else{
                    System.out.println("Invalid Amount !");
                }
            }
            public static void withdraw(){
                System.out.println("Enter Amount to Withdraw:");
                double amount = sc.nextDouble();

                if(amount>balance){
                    System.out.println("Insufficient Balance!");
                }else if(amount<=0){
                    System.out.println("Enter Valid Amount!");
                }else{
                    balance -= amount;
                    history += "Withdraw:"+ amount +"\n";
                    System.out.println("Please collect your Amount"+" "+ amount);
                    System.out.println("Remaining Amount:"+" "+ balance);
                }
        }
        public static void showMiniStatement(){
            System.out.println("\n---------TRANSACTION HISTORY---------");
            if(history.isEmpty()){
                System.out.println("No transactions done");
            }else{
                System.out.println(history);
            }
            System.out.println("Current Balance:"+" "+ balance);
      sc.close();
        }
}
