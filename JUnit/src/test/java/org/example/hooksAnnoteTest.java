package org.example;

import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;

public class hooksAnnoteTest {
    hooksAnnote ha = new hooksAnnote();

    @Before
    public void setup(){
        System.out.println("Setup section in Before");
    }

    @BeforeAll
    public static void before(){
        System.out.println("Before All Section");
    }

    @AfterAll
    public static void after(){
        System.out.println("After All Section");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each Section");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All Section");
    }

    @Test
    public void testing1(){
        assertEquals(4, ha.sample(3));
    }

    @Test
    public void testing2(){
        assertEquals(1, ha.sample(9));
    }
}
