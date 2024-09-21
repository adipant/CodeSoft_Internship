//This Is Java Programming Task of CodSoft
//ATM_InterFace.java

import java.util.Scanner;
import java.lang.String;

class ATM {
    int PIN = 2208;       //    Default account PIN is 2208
    int Balance;

    public void checkPIN(){
        System.out.println("Please Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if (enteredPIN == PIN) {
            menu();
        } else {
            System.out.println("Invalid PIN!!");
            checkPIN();
        }
    }


    public void menu() {

        System.out.println("~~~~~~~Welcome To CodSoft ATM Machine~~~~~~~");

        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter Your Choice");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) checkBalance();

        else if (opt == 2) withdrawMoney();

        else if (opt == 3) depositMoney();

        else if (opt == 4) return;

    }

    public void checkBalance() {
        System.out.println("Balance is " + Balance + "₹");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to Withdraw");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
            System.out.println("~~~~~~~~~~~~~~~~~~");
        } else {
            Balance = Balance - amount;
            System.out.println("Amount Successfully Withdrawl");
            System.out.println("~~~~~~~~~~~~~~~~~~");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Please Enter The Amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        Balance += amount;
        System.out.println("Amount is Deposited & " + "Now, Balance is " + Balance + "₹");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        menu();
    }
}

public class ATM_InterFace {
    public static void main(String[] args) {
        System.out.println("HINT: Your Default PIN is 2208 & Deposit Amount First");
        ATM obj = new ATM();
        obj.checkPIN();
    }
}
