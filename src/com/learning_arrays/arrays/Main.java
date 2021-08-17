package com.learning_arrays.arrays;

public class Main {
    public static void main(String[] args) {
        enhancedForTest();
    }

    // enhanced for loop
    public static void enhancedForTest(){
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

        // add each element's value to total
        for (int number : array)
            total += number;
        System.out.printf("Total of array elements: %d%n", total);
    }

    public static void arrayFUnc1(){
        int[] array = new int[10];

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }

    public static void arrayFunc2(){
        // initializer list specifies the initial value for each element
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }

    public static void arrayFunc3(){
        final int ARRAY_LENGTH = 10; // declare constant
        int[] array = new int[ARRAY_LENGTH]; // create array

        // calculate value for each array element
        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }

    public static void arrayTotal(){
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;

       // add each element's value to total
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];
        System.out.printf("Total of array elements: %d%n", total);
    }
}
