// Write a java program to decrement FOR loop.

import java.util.Scanner;

public class program6_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        for (int i = 10; i >= 1; i--) {
            System.out.println("Loop " + i + ": " + name);
        }
        
        scanner.close();
    }
}