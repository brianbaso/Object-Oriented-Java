
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int upper = Integer.parseInt(reader.nextLine());
        
        int start = lower;
        
        while (start <= upper) {
            System.out.println(start);
            start++;
        }
    }
}
