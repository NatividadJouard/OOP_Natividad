/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runsavingsaccount;

import java.util.*;


class SavingsAccount{
   
        private double balance;
        public static double interestRate = 0;
    
    public SavingsAccount(){
        balance = 0;
    }
        
    public static void setInterestRate(double newRate){
        interestRate = newRate;
    }
        public static double getInterestRate(){
            return interestRate;
        }
            public double getBalance() {
                return balance;
            }
                public void deposit(double amount){
                    balance += amount;
                }
                    public double withdraw(double amount){
            if(balance >= amount){
                balance -= amount;
                return amount;
            }
            else{
                return 0;
            }
        }
            public void addInterest(){
                double interest = balance * interestRate;
                balance += interest;
            }
            public static void showBalance(SavingsAccount account) {
                System.out.println(account.getBalance());
            }
}

public class RunSavingsAccount {
    
  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        SavingsAccount savings= new SavingsAccount();
        
           System.out.print("Enter interest rate: ");
           double interestRate=scan.nextDouble();
           SavingsAccount.setInterestRate(interestRate);
           
           while (true) {
            System.out.println("____________________________");
            System.out.println("Press Key corresponding to your desired action.");
            System.out.println("\nD - Deposit \nW - Withdraw \nB - Check Balance \nO - Cancel");
            
            char choice = scan.next().charAt(0);
            if (choice == 'D' || choice == 'd') {
                System.out.print("Amount to be deposited: ");
                double depositAmount = scan.nextDouble();
                savings.deposit(depositAmount);
                System.out.print("New Available Balance: ");
                SavingsAccount.showBalance(savings);
            } 
            
            else if (choice == 'B' || choice == 'b'){
                if (savings.getBalance()<1000){
                System.out.print("Available Balance: ");
                SavingsAccount.showBalance(savings);
                }
                if (savings.getBalance() >= 1000) {
                        savings.addInterest();
                    System.out.println("Available Balance with interest: " + savings.getBalance());    
                    }
                }
            else if (choice == 'W' || choice == 'w') {
                System.out.print("Amount to Withdraw: ");
                double withdrawAmount = scan.nextDouble();
                double withdraw = savings.withdraw(withdrawAmount);
                
                if (withdraw == 0){
                    System.out.println("Insufficient Funds.");
                } 
                else {
                    System.out.println("Amount Withdrawn: " + withdraw);
                    System.out.println("Available Balance: " );
                    SavingsAccount.showBalance(savings);
                    
                  if (savings.getBalance() >= 1000) {
                        savings.addInterest();
                        System.out.println("Updated Balance: " + savings.getBalance());
                    }  
                }
            } 
            else if (choice == 'O' || choice == 'o'){
                System.out.println("Exit Savings Account");
                break;
            } 
            else {
                System.out.println("Invalid Key.");
            }
        }
    }
}