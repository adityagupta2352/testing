package com.github.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.util.Arrays;
import java.util.List;

public class AssertExample {

    // Assertion -> Validating actual result with expected result

    // Assertions Class

    @Test
    public void test1() {

        System.out.println("Testing come assertion methods");

//        float actual = 12;
//
//        Float expected = 12.0f;
//
//        Assertions.assertEquals(expected, actual);

//        int []actualIntArray = {1,2,3,4,5};
//        int []expectedIntArray = {1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray , actualIntArray);

//        String name = new String("Rahul");
//        String expectedName = new String("Rahul");

//          String name = "Rahul";
//          String expectedName = "Rahul";
//
//        Assertions.assertSame(name , expectedName);
//        Assertions.assertEquals(name , expectedName);


//        Assertions.assertNull();
//        Assertions.assertNotNull();
//        boolean b = true;
//        Assertions.assertTrue(b);
//        Assertions.assertFalse();

//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
//
//        Assertions.assertIterableEquals(list2, list1);

        Assertions.assertThrows(RuntimeException.class , () -> {

            System.out.println("This is testing executable");
            throw new RuntimeException("This is testing exception");
        });
    }
}
