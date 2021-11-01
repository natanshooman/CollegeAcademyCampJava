
import java.util.Scanner;
public class MoonWeight
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a weight in pounds");
        Double weight = input.nextDouble();
        weight = weight/6;
        System.out.println("That would be " + weight + " pounds on the moon");
     }
    
}