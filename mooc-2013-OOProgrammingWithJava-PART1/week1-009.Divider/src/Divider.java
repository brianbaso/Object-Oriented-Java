
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + numberOne + " / " + numberTwo + " = " + ((float) numberOne / numberTwo));
    }
}
