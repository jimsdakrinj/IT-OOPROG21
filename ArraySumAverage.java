/*
    Name: James Gabriel B. Turceno
    Program / Year: BSIT - II
*/

// Write a Java program that asks the user to input 5 integers, stores them in a one-dimensional array, then computes and displays the sum and average of all elements.

import java.util.*;

class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] integerStore = new int[5];
        int sum = 0;
        double average;
        
        System.out.println("Enter 5 numbers ");
        for(int i = 0; i < 5; i++){
            System.out.printf("Number %d: ", i+1);
            integerStore[i] = scanf.nextInt();
            sum += integerStore[i];
        }
        average = sum / 5.0;
        
        System.out.printf("\n\nSum: %d\n", sum);
        System.out.printf("Average: %.2f", average);
    }
}
