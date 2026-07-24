import java.util.Scanner;

public class program8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
           System.out.println("Monday");
           System.out.println("Tuesday");
           System.out.println("Wednesday");
           System.out.println("Thursday");
           System.out.println("Friday");
           System.out.println("Saturday");
           System.out.println("Sunday");
           System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}