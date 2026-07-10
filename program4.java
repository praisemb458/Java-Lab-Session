// Write a java program to display arithmetic operations

public class program4 {
    public static void main(String[] args) {
  
        if (args.length < 2) {
            System.out.println("Provide two numbers as command line arguments.");
            System.out.println("Example: java ArithmeticOperations 10 5");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Addition:       " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction:    " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division:       " + num1 + " / " + num2 + " = " + quotient);
        } else {
            System.out.println("Division:       Cannot divide by zero!");
        }
    }
}