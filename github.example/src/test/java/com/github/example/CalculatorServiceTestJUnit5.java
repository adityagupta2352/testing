package com.github.example;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {


    // Execute the logic before all test cases

    @BeforeAll
    public static void init() {
        System.out.println("This is single time logic");
    }

    @BeforeEach()
    public void eachTestCase() {
        System.out.println("Before each");
    }

    @Test
    @DisplayName("This is custom name")
    public void addTwoNumbersTest() {

        System.out.println("First Test Case");

        int result = CalculatorService.addTwoNumbers(12, 12);

        int expected = 24;

        Assertions.assertEquals(result, expected, "Test Case Failed");
    }

    @Test
    @Disabled
    public void addAnyNumbersTest() {

        System.out.println("Second Test Case");

        int result = CalculatorService.sumAnyNumbers(12, 10, 10, 10, 18);

        int expected = 60;

        Assertions.assertEquals(result, expected);
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("After all test case");
    }

    @AfterEach
    public void afterTestCase() {
        System.out.println("After each");
    }

    // @Tag , @Nested , @TestFactory

}
