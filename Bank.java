
import java.util.Scanner;
public class Bank {
    static Scanner input = new Scanner(System.in);
  static void showBalance(double balance){
      System.out.printf("Your account balance is: %.2f ",balance);
  }
  static double deposit(){
      System.out.print("Enter the amount you'd like to deposit: ");
      double amount = input.nextDouble();
      if(amount<0){
          System.out.println("The amount to be deposited can't be a negative");
          return 0 ;
      }else {
          System.out.printf("You have successfully deposited: %.2f", amount);
          return amount;
      }
  }
  static double withdraw(double balance){
      System.out.print("Enter the amount you'd like to withdraw: ");
      double amount= input.nextDouble();
      if(amount<0){
          System.out.println("the amount you want to withdraw can't be a negative number.");
          return 0 ;
      }else if(amount>balance){
          System.out.println("Insufficient funds");
          return 0;
      }else{
          System.out.printf("you have successfully withdrawn: %.2f" ,amount);
          return amount;
      }
  }

    public static void main(String[] args) {
        int choice = 0;
        double balance = 0;
        boolean isRunning=true;

        while(isRunning) {
            System.out.println("*********");
            System.out.println("BANKING PROGRAM");
            System.out.println("*********");
            System.out.println("1.show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("*********");

            System.out.print("Enter your choice(1-4): ");
            choice = input.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+=deposit();
                case 3 ->balance-=withdraw(balance);
                case 4 ->isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

    }
}
