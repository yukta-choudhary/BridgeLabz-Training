package com.junit.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.junit.main.BankAccount;

class BankAccountTest {

    BankAccount acc = new BankAccount();

    @Test
    void testDeposit() {
        acc.deposit(1000);
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testWithdrawFail() {
        assertThrows(IllegalArgumentException.class,
                () -> acc.withdraw(500));
    }
}

