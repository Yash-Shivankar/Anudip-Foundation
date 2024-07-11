package com.Anudip;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
     System.out.println("Current balance: $" + balance);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient funds. Withdrawal denied.");
     }
     System.out.println("Current balance: $" + balance);
 }

 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends BankAccount {
 private static final double WITHDRAWAL_LIMIT = 500.0;

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= WITHDRAWAL_LIMIT && amount <= getBalance()) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal limit exceeded or insufficient funds. Withdrawal denied.");
     }
 }
}

class CheckingAccount extends BankAccount {
 private static final double OVERDRAFT_FEE = 30.0;

 public CheckingAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= getBalance()) {
         super.withdraw(amount);
     } else {
         System.out.println("Insufficient funds. Overdraft fee of $" + OVERDRAFT_FEE + " applied.");
         super.withdraw(OVERDRAFT_FEE);
     }
 }
}

public class BankAccountDemo {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount(1000.0);

     System.out.println("Testing SavingsAccount:");
     savingsAccount.deposit(200.0);
     savingsAccount.withdraw(400.0); 
     savingsAccount.withdraw(600.0); 
     System.out.println();

     CheckingAccount checkingAccount = new CheckingAccount(500.0);

     System.out.println("Testing CheckingAccount:");
     checkingAccount.deposit(100.0);
     checkingAccount.withdraw(300.0);
     checkingAccount.withdraw(700.0); 
 }
}

/*
Testing SavingsAccount:
Deposited: $200.0
Current balance: $1200.0
Withdrawn: $400.0
Current balance: $800.0
Withdrawal limit exceeded or insufficient funds. Withdrawal denied.

Testing CheckingAccount:
Deposited: $100.0
Current balance: $600.0
Withdrawn: $300.0
Current balance: $300.0
Insufficient funds. Overdraft fee of $30.0 applied.
Withdrawn: $30.0
Current balance: $270.0
*/