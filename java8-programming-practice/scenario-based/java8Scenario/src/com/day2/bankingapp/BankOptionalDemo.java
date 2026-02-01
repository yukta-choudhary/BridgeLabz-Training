package com.day2.bankingapp;
import java.util.Optional;

public class BankOptionalDemo {

    public static void main(String[] args) {

        BankAccount acc =
                new BankAccount(null, null, null, null, null);

        // 1. Nominee
        Optional<String> nominee =
                Optional.ofNullable(acc.getNominee());
        System.out.println("Nominee: " +
                nominee.orElse("No Nominee"));

        // 2. Loan details
        Optional<String> loan =
                Optional.ofNullable(acc.getLoanDetails());
        loan.ifPresent(l ->
                System.out.println("Loan: " + l));

        // 3. Balance default
        Optional<Double> balance =
                Optional.ofNullable(acc.getBalance());
        System.out.println("Balance: " +
                balance.orElse(1000.0));

        // 4. Transaction reference
        Optional<String> txn =
                Optional.ofNullable(acc.getTransactionRef());
        System.out.println("Transaction Ref: " +
                txn.orElse("Not available"));

        // 5. Credit card details
        Optional<String> card =
                Optional.ofNullable(acc.getCreditCard());
        card.ifPresent(c ->
                System.out.println("Credit Card: " + c));
    }
}

class BankAccount {
    private String nominee;
    private String loanDetails;
    private Double balance;
    private String transactionRef;
    private String creditCard;

    public BankAccount(String nominee, String loanDetails,
                       Double balance, String transactionRef,
                       String creditCard) {
        this.nominee = nominee;
        this.loanDetails = loanDetails;
        this.balance = balance;
        this.transactionRef = transactionRef;
        this.creditCard = creditCard;
    }

    public String getNominee() { return nominee; }
    public String getLoanDetails() { return loanDetails; }
    public Double getBalance() { return balance; }
    public String getTransactionRef() { return transactionRef; }
    public String getCreditCard() { return creditCard; }
}
