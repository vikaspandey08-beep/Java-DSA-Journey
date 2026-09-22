import java.util.Scanner;

public class Switch {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch(choice) {
            case 1 : System.out.println("JANAUARY");
            break;

            case 2 : System.out.println("FEBRUARY");
            break;

            case 3 : System.out.println("MARCH");
            break;

            case 4 : System.out.println("APRIL");
            break;

            case 5 : System.out.println("MAY");
            break;

            case 6 : System.out.println("JUNE");
            break;

            case 7 : System.out.println("JULY");
            break;

            case 8 : System.out.println("AUGUST");
            break;

            

            default : System.out.println("INVALID REQUEST");
        }
        sc.close();
      }
    }
