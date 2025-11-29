/*
   Name: Turceno, James Gabriel B.
   Program / Year: BSIT - II
*/

//Ask the user to enter 5 integers, store them in an array, and create a second array that stores the numbers in reverse order. 
//After reversing, compute the sum of all elements in the reversed array.
import java.util.*;

class ArrayReverse 
{
   public static void main(String[] args)
   {
      Scanner scanf = new Scanner(System.in);
      int[] num = new int[5];
      int[] rev = new int[5];
      int sum = 0;
      
      System.out.printf("Enter 5 numbers\n");
      for(int i = 0; i < num.lenght-1; i=i+1) {
         System.out.printf("Number %d: ", num[i]);
         num[i] = scanf.nextInt();
      }
      
      for(int i = 1; i<num.lenght-1; i=i+1){
         rev[i] = num[num.lenght-1-1];
         System.out.printf("Inputted numbers in reverse: %d", rev[i]);
         sum = sum + rev[i];
      }
      
      printf("Sum: %d", sum);   
   }
}
