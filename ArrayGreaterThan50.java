/*
  Name: James Gabriel B. Turceno
  Course / Year: BSIT - II
*/
//Desciption: ArrayGreaterThan50.java Read 6 integers into an array. Count how many of them are greater than 50 and display the count.

import java.util.Scanner;

public class ArrayGreaterThan50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[6];
        int count = 0;
        
        System.out.printf("Enter 6 integers: \n\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number %d: ", i + 1);
            numbers[i] = sc.nextInt();
            
            if (numbers[i] > 50) {
                count++;
            }
        }
        
        System.out.printf("\nCount of numbers greater than 50: %d", count);

    }
}
