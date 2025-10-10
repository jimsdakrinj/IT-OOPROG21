/*
Name: Turceno, James Gabriel B.
Course / Year: BSIT - II

Description: 
MidtermAct7: Multiplication Practice Quiz  Use a for loop to ask the user 5 random multiplication questions.  
Use a nested condition to check if the answer is correct: o If correct, increase score. o Else, print "Try harder."  
At the end, use a switch case to classify score: 

o 5: "Excellent" 
o 3–4: "Good" 
o 1–2: "Needs Practice" 
o 0: "Failed"
*/

import java.util.Scanner;
import java.util.Random;

class MidtermAct7 {
   public static void main(String[] args){
      Scanner scanf = new Scanner(System.in);
      Random rand = new Random();
      
      int question = 5;
      int score = 0;
      int num1, num2, corrAns, userAns;
      
      for(int i = 1; i <= question; i++){
         num1 = rand.nextInt(10)+ 0;     // sa nextInt(10) ang number kay mag range siya from -10 to 10. imo siya +0 para mag sugod siya from 0 to 10.
         num2 = rand.nextInt(10) + 0;
         corrAns = num1 * num2;
         
         System.out.printf("Question %d: What is %d x %d = ? \nAnswer: ", i, num1, num2);
         userAns = scanf.nextInt();
         
         if(userAns == corrAns){
            score++; //if ang answer kay sakto mo add iyahang score
         }else{
             System.out.println("Try harder.");
         }
      }
         switch(score){
            case 5:
               System.out.printf("\n\nScore %d: Excellent", score);
               break;
            case 4: //wala nako butangi diri dapita kay if 4 ang total score mo dritso siya ambak sa case 3. bale mura ra siyag if(score == 4 || score == 3)
            case 3:
               System.out.printf("\n\nScore %d: Good", score);
               break;
            case 2:
            case 1:
               System.out.printf("\n\nScore %d: Needs practice.", score);
               break;
            case 0:
               System.out.printf("\n\nScore %d: Failed.", score);  
               break;
            default:
               System.out.println("\n\nFailed.");   
         }   
      scanf.close();
   }
}
