
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();
        System.out.println("Type your age: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.println("Type your age: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        System.out.println(nameOne + " and " + nameTwo + " are " + (numberOne + numberTwo) + " years old in total.");
    }
}
