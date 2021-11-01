
import java.util.Scanner;
import java.util.Random;
    public class RockPaperSizzors
  {
        public static void main (String[] args){
        String userPlay;
        String compPlay = "";
        int compInt;
        boolean run = true;
   
        Scanner input = new Scanner (System.in);
        Random generator = new Random();
        
        System.out.print("welcome to Rock, Paper, Scissors!");
        do{
        compInt = generator.nextInt(3)+1;
    
        switch (compInt){
            case 1:
                compPlay = "rock";
                break;
            case 2:
                compPlay = "paper";
                break;
            case 3:
             compPlay = "scissors";
                break;
    }
    System.out.println("Enter you play(rock, paper, or scissors)");
    userPlay = input.next();
    
    System.out.printf("Computer play is %s\n", compPlay);
       if (userPlay.equals(compPlay)){
        System.out.println("Its a tie!");
         }
         else if (userPlay.equals("rock")){
        if(compPlay.equals("scissors"))
        System.out.println("Rock beats scissors; you win!");
        else if (compPlay.equals("paper"))
        System.out.println("Paper beats rock; you lose!");
       }
    
    
         else if (userPlay.equals("paper")){
        if(compPlay.equals("rock"))
        System.out.println("Paper beats rock; you win!");
        else if (compPlay.equals("scissors"))
        System.out.println("Scissors beats rock; you lose!");
        }
   
        else if (userPlay.equals("scissors")){
          if(compPlay.equals("paper"))
          System.out.println("Scissors beats paper; you win!");
          else if (compPlay.equals("rock"))
          System.out.println("Rock beats paper; you lose!");
        }
        else {
        System.out.println("Invalid user input.");
    }
     System.out.println("Invalid user input.");
     run = input.nextBoolean();
   }while (run == true);
    input.close();
   System.exit(0);
  }
}
