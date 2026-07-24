import java.util.Scanner;


public class program10_1 {

    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Here is the * pattern");
    System.out.print("Enter your number :");
     
    int n = input.nextInt();

    int i,j;

         {
          for (i = 1; i <= 5; i++) {
            
          for (j = 1; j <= i; n++) {
          System.out.print("*"); 
            }

            System.out.println(""); }
        
    }
  }

}