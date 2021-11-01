
import java.util.Scanner;
public class MadLibs
{
    // instance variables - replace the example below with your own
   

      public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        String name1,place2,adjective3,pluralnoun4,adjective5,pluralnoun6;
        
        
        System.out.println("Please enter a name:");
        name1 = input.nextLine();
        
        System.out.println("Please enter a place:");
        place2 = input.nextLine();
        
        System.out.println("Please enter a adjective:");
        adjective3 = input.nextLine();
        
        System.out.println("Please enter a plural noun:");
        pluralnoun4 = input.nextLine();
        
        System.out.println("Please enter a adjective:");
        adjective5 = input.nextLine();
        
        System.out.println("Please enter a pluralnoun:");
        pluralnoun6 = input.nextLine();
        
        
        
       System.out.printf("Last summer,my mom and dad took me and %s on a trip to %s.",name1,place2);
       System.out.printf("The weather there is very %s! Northern %s has many %s,and they make %s %s" ,adjective3,place2,pluralnoun4,adjective5,pluralnoun6);
    
         }
}