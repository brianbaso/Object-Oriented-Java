
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int power = 0, i = 0, result = 0;
        
        while (i <= number) {
            result += (int) Math.pow(2, i);
            i++;
        }
        System.out.println("The result is " + result);

    }
}
