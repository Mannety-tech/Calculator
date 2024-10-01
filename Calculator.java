import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Display Menu
        System.out.println("Select operation");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");


        //Take user choise
        System.out.println("Enter choice (1/2/3/4):");
        int choice = scanner.nextInt();

        //Take input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        

        System.out.print("Enter second number:");
        double num2  = scanner.nextDouble();

        //perform calculation based on the choice
        switch(choice) {
            case 1:
                System.out.println("Result:" +(num1 + num2));
                break;
            case 2:
                System.out.println("Result:" +(num1 - num2));
                break;
            case 3:
                System.out.println("Result:" +(num1 * num2));
                break;
            case 4:
                if (num2 !=0) {
                    System.out.println("Result: " + (num1 * num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid input");

        }
        scanner.close();
    }
}
