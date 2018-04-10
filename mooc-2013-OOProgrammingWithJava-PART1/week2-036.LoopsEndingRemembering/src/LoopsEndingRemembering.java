import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        
        int result = 0, number = 0, count = 0, even = 0, odd = 0;
        
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number != -1 && number % 2 == 0) {
                result += number;
                count++;
                even++;
                
            } else if (number != -1 && number %2 != 0) {
                result += number;
                count++;
                odd++;
                
            } else {
                break;
            }
        }
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + ((double)result / count));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
        
    }
}
