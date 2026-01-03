package com.day3.MyBank;

//Interface for transactions
public interface ITransaction {

 void deposit(double amount);

 void withdraw(double amount);

 void checkBalance();
}
