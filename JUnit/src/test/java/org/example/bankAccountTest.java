package org.example;

import org.junit.Before;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class bankAccountTest {
    bankAccount acc1 = null;

    @Before
    public void setup(){
        acc1=new bankAccount();
    }

    @Test
    public void bankAccTest1(){
        assertThrows(InsufficientFundsException.class, () -> acc1.withdraw(20000));
    }

    @Test
    public void bankAccTest2(){
        assertEquals(5000,acc1.withdraw(10000));
    }
}
