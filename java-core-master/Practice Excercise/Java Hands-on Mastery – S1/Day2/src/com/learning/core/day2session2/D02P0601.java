package com.learning.core.day2session2;

import java.util.Scanner;

class BankAccount {
private String accType;
private float balance;

public BankAccount(int accNo, String custName, String accType, float balance) throws NegativeAmountException, LowBalanceException {
   this.accType = accType;
   if (balance < 0) {
       throw new NegativeAmountException("Negative Amount");
   }
   this.balance = balance;
   checkInitialBalance(accType, balance);
}

public void deposit(float amt) throws NegativeAmountException {
   if (amt < 0) {
       throw new NegativeAmountException("Negative Amount");
   }
   this.balance += amt;
}

public float getBalance() throws LowBalanceException {
   if ((this.accType.equalsIgnoreCase("Saving") && this.balance < 1000) ||
       (this.accType.equalsIgnoreCase("Current") && this.balance < 5000)) {
       throw new LowBalanceException("Low Balance");
   }
   return this.balance;
}

private void checkInitialBalance(String accType, float balance) throws LowBalanceException {
   if ((accType.equalsIgnoreCase("Saving") && balance < 1000) ||
       (accType.equalsIgnoreCase("Current") && balance < 5000)) {
		throw  new LowBalanceException("Low Balance");
   }
}
}
public class D02P0601 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter account number:");
        int accNo = scanner.nextInt();
        scanner.nextLine(); 
 
        System.out.println("Enter customer name:");
        String custName = scanner.nextLine();
 
        System.out.println("Enter account type (Saving or Current):");
        String accType = scanner.nextLine();
 
        System.out.println("Enter initial balance:");
        float balance = scanner.nextFloat();
 
        try {
            BankAccount account = new BankAccount(accNo, custName, accType, balance);
            System.out.println("Account created successfully. Balance: " + account.getBalance());
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
