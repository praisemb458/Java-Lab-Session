// Write a java program to decrement Do While Loop.

import java.util.Scanner;

public class program6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 10;
        do {
            System.out.println("Remaining: " + i + " | " + name);
            i--; 
        } while (i > 0);
        
        scanner.close();
    }
}