/*
    Name: James Gabriel B. Turceno
    Program / Year: BSIT - II
*/

// Create a Java program that asks the user for 6 integer values, stores them in an array, and then determines the largest and smallest numbers in the array using a loop.

import java.util.*;

class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] num = new int[6];
        int sum = 0;
        
        
        System.out.printf("Enter 6 numbers\n\n");
        for(int i = 0; i < 6; i++){
            System.out.printf("Number %d: ", i+1);
            num[i] = scanf.nextInt();
        }
        
        int largest = num[0];
        int smallest = num[0];
        
        for(int i = 1; i < 6; i++){
            if(num[i] > largest){
                largest = num[i];
            }else if(num[i] < smallest){
                smallest = num[i];
            }
        }
        
        System.out.printf("\nHighest: %d\n", largest);
        System.out.printf("smallest: %d", smallest);
        
    }
}
