import java.util.Scanner;

public class program6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nPrinting 10 times using DO-WHILE loop:");
        int i = 1;
        do {
            System.out.println(i + ". " + name);
            i++;
        } while (i <= 10);
        
        scanner.close();
    }
}