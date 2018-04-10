
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        int i = lower, result = 0;
        
        while (i <= upper) {
            result += i;
            i++;
        }
        System.out.println("The sum is " + result);
    }
}
