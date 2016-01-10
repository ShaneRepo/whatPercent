import java.util.Scanner;
public class whatPercent {
    public static void main (String [] args){
        double num1;
        double num2;
        // Getting user input
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the value of number 1 please. ");
        num1 = input.nextDouble();
        System.out.println("\nEnter the value of number 2 please. ");
        num2 = input.nextDouble();
        // Method call
        computePercent(num1, num2);
    }

    public static void computePercent(double num1, double num2)
    {
        double percentage;
        percentage = num1 / num2 * 100;
        System.out.println("\n" + num1 + " is %" + percentage + " of " + num2);
    }
}
