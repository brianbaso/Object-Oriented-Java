
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        // Remove or comment out these lines above before trying to run the tests.
        
        while (true) {
            System.out.println("Enter a temp: ");
            double temp = Double.parseDouble(reader.nextLine());
            
            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);
            }
        }
    }
}
