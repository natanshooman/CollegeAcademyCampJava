

import java.util.Random;
import java.util.Scanner;
public class GuessTheNum
{
    public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   Random generator = new Random();
   int number = generator.nextInt(10)+1;
   int guess = 0;
   int attempt = 1;
   boolean run = true;
   System.out.println("Welcome to Guess the Number! I'm Thinking of a number between 1 and 10");
    
   while(guess!=number){
       System.out.printf("What is your guess? (Attempt:%d\n", attempt);
       guess = input.nextInt();
       attempt++;
       
  
   
    }
    System.out.printf("Correct! You guessed my number in %d tries!,attempt-1");
    System.out.println ("Do you want to play again?");
    run=input.nextBoolean();
    
}
}