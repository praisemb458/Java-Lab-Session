Write a program using While loop.

import java.util.Scanner;

public class program6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nPrinting 10 times using WHILE loop:");
        int i = 1;
        while (i <= 10) {

            System.out.println(i + ". " + name);
            i++;
        }
        
        scanner.close();
    }
}