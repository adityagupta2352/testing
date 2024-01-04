package com.github.example;

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    // JUNIT 4

    int counter = 0;

    // Test Method Od Add Two Numbers

    // Before All The Test Cases
    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases :");
        System.out.println("Started test : " + new Date());

        // Connection Open / File Open
    }

    @Before // Executes the method before each test case
    public void beforeEach(){
        System.out.println("Before each test case");
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {

        for(int i=1 ; i<=20 ; i++){
            counter += i;
        }

        Thread.sleep(3000);
        System.out.println("Test For AddTowNumbersTest");

        int result = CalculatorService.addTwoNumbers(12 , 45);

        int expected  = 57;

        System.out.println("Counter in first test case : " + counter);

        Assert.assertEquals(expected , result);
    }

    @Test
    public void sumAnyNumberTest(){

        for(int i=1 ; i<=100 ; i++){
            counter += i;
        }

        System.out.println("Test For SumAnyNumberTest");

        int result = CalculatorService.sumAnyNumbers(12,10,10,10,18);

         int expected = 60;

        System.out.println("Counter in second test case : " + counter);

        Assert.assertEquals(result , expected);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("End test cases : " + new Date());
    }


}
