
import java.util.Scanner;
public class Calculator
{
   public static void main (String[] args) {
       Scanner input = new Scanner (System.in);
       double num1,num2;
       String operation;
       boolean run=true;
       while(run==true){
       System.out.println("Please enter your operation-Press enter after each input");
       num1 = input.nextDouble();
       operation = input.next ();
       num2 = input.nextDouble();
    
       switch(operation){
           case "+":
               System.out.println(num1 + num2);
               break;
               
           case "-":
               System.out.println(num1 - num2);
               break;
               
           case "*":
               System.out.println(num1 * num2);
               break;
               
           case "/":
               System.out.println(num1 / num2);
               break;
               
           default:
           System.out.println("Invalid input");
               
        }
}
System.out.println("Do you want to perform another opperation?");
run = input.nextBoolean();
}
}
