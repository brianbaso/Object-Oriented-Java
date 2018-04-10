
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        String attempt = "";
        
        while (!attempt.equals(password)) {
            
            System.out.println("Type the password: ");
            attempt = reader.nextLine();
            
            if (attempt.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: meow!");
    }
}
