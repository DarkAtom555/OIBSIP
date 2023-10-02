package ATM_INTERFACE;
import java.util.*;
class ATM {
    double Balance;
    int PIN = 5555;

      ATM() {
               System.out.print("Enter Your PIN: ");
             Scanner sc = new Scanner(System.in);
             int pin = sc.nextInt();
            if (pin == PIN) menu();
           else System.out.println("Invalid PIN ");
    }


    public void menu() {
        System.out.println("WELCOME TO ATM MACHINE!");
        System.out.println("1.A/C BALANCE");
        System.out.println("2.WITHDRAW MONEY");
        System.out.println("3.DEPOSIT MONEY");
        System.out.println("4.QUIT");
        System.out.print("ENTER YOUR CHOICE: ");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withDrawn();
                break;
            case 3:
                Deposit();
                break;
            case 4:
                return;

            default:
                System.out.println("INVALID INPUT!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: RS." + Balance);
        menu();
    }

    public void withDrawn() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextInt();
        if (amt > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance -= amt;
            System.out.println("RS." + amt + " Withdrawn Successful");
        }
        menu();
    }

    public void Deposit() {
        System.out.println("Enter Amount for Deposit: ");
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextInt();
        Balance += amt;
        System.out.println("RS." + amt + " Deposited Successfully");
        menu();

    }
}
public class ATM_INTERFACE {
    public static void main(String[]args){
     ATM obj=new ATM();

    }
}
