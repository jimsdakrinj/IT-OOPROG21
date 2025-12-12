/*
  Name: James Gabriel B. Turceno
  Course / Year: BSIT - II
*/
//Description: Let the user enter 6 integers into an array. Compute the sum of only the positive numbers (ignore negative values).

import java.util.Scanner;

public class ArrayPositiveNumbersOnly {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int[] numbers = new int[6];
        int sum = 0;
        
        System.out.println("Enter 6 integers:\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number %d: ", i + 1);
            numbers[i] = scanf.nextInt();
            
            if (numbers[i] > 0) {
                sum += numbers[i];
            }
        }
        
        System.out.printf("\nSum of positive numbers: %d", sum);
    }
}
