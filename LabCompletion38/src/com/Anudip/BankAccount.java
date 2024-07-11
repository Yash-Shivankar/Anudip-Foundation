package com.Anudip;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
            System.out.println("Current balance after deposit: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
                System.out.println("Current balance after withdrawal: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Insufficient funds.");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100.0);
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(200.0);
                try {
                    Thread.sleep(50); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}

/*
Thread-0 deposited: 100.0
Current balance after deposit: 1100.0
Thread-1 withdrew: 200.0
Current balance after withdrawal: 900.0
Thread-1 withdrew: 200.0
Current balance after withdrawal: 700.0
Thread-0 deposited: 100.0
Current balance after deposit: 800.0
Thread-1 withdrew: 200.0
Current balance after withdrawal: 600.0
Thread-0 deposited: 100.0
Current balance after deposit: 700.0
Thread-0 deposited: 100.0
Current balance after deposit: 800.0
Thread-0 deposited: 100.0
Current balance after deposit: 900.0
Final balance: 900.0
*/
