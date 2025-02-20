

import java.util.Scanner;

class BankAccount {
    private int account_number;
    private double balance;

    public BankAccount(int account_number,double init_balance){
        this.account_number = account_number;
        if (init_balance>=0){
            this.balance=init_balance;
        }
        else{
            System.out.println("Initial balance cannot be negative");
            this.balance=0;
        }
    }
    public int getAccountNumber(int account_number){
        return account_number;
    }
     public int getBalance(int balance){
        return balance;
    }
   public void deposit(double dep_amount)
    {   System.out.println();
        if(dep_amount>0){
            balance+=dep_amount;
            System.out.println("Deposited: Rs."+ dep_amount + "in your account : "+ account_number);
            System.out.println("Available Account Balance: Rs."+ balance);
        }
        else{
            System.out.println("Deposit amount must be positive");
        }
        System.out.println();
    }
    public void withdraw( double with_amount ){
        System.out.println();
        if(balance>=with_amount){
            balance-=with_amount;
            System.out.println("Withdrawn successfully from your account : "+ account_number);
            System.out.println("Available Account Balance: Rs."+ balance);
        }   
        else{
            System.out.println("Insufficient Balance");
        }
        System.out.println();
    }
}  

public class Encapsulation{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Account Number:");
        int acc_no= sc.nextInt();
        System.out.print("Enter the initial balance:");
        double balance = sc.nextDouble();
        BankAccount acc = new BankAccount(acc_no,balance);
        while (true) { 
            
        

        System.out.println("===== Bank Account Management =====");
        System.out.println("1. Deposit\n2. Withdraw\n3. Exit");
       
        System.out.print("Enter choice:");
        int ch = sc.nextInt();

        switch(ch){
        case 1:
        {
            System.out.print("Enter deposit amount :");
            double amt = sc.nextDouble();
            acc.deposit(amt);
            break;
        }
        case 2:{
            System.out.print("Enter debit amount :");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
            break;
        }
        case 3:{
            System.out.println("Thank you!");
            sc.close();
            System.exit(0);
        }
        default:
            System.out.println("Invalid Choice... Select valid option...");
            break;
        }
        
        }


    }
    
}