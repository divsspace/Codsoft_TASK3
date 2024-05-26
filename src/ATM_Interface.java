

import java.util.*;
interface ATM {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
//IMPLEMENTING THE METHODS
class ATM__Interface implements ATM {
    double balance=00.00;
    public void withdraw(double withAmount)
    {
        if(withAmount<=balance)
        {
            balance=balance-withAmount;
            System.out.println("Withdrawal initiated. Kindly collect the amount.");
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    public void deposit(double depAmount)
    {
        balance=balance+depAmount;
        System.out.println("The funds have been deposited in your account.");
    }
    public double checkBalance()
    {return balance;}
}
//RUNNING THE TRANSACTIONS ACCORDING TO USER'S CHOICE
class ATMInterface
{
    ATM account;
    public ATMInterface(ATM ACCOUNT) {
        this.account = ACCOUNT;
    }
    public void display() {
        System.out.println("Welcome to the ATM Menu!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void Menu() {
        Scanner input = new Scanner(System.in);
        int userchoice;
        System.out.println("Welcome to the ATM.");
        long AcctNo;
        int Pin;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Account No. : ");
        AcctNo=obj.nextLong();
        System.out.println("Enter Pin : ");
        Pin=obj.nextInt();
        do {
            display();
            System.out.print("Enter your choice : ");
            userchoice = input.nextInt();
            switch (userchoice) {
                case 1:
                    System.out.print("Enter amount to be deposited: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to be withdrawn: ");
                    double withAmt = input.nextDouble();
                    account.withdraw(withAmt);
                    break;
                case 3:
                    System.out.println("Your current account balance is: " + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again please.");
                    break;
            }
        } while (userchoice != 4);
    }
    public static void main(String[] args) {
        ATM Account = new ATM__Interface();
        ATMInterface obj = new ATMInterface(Account);
        obj.Menu();
    }
}