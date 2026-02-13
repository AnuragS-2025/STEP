import java.util.Scanner;

public class DigitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = Math.abs(scanner.nextLong()); // Handle negative numbers
        scanner.close();
        
        final int MAX_DIGITS = 10;
        int[] digits = new int[MAX_DIGITS];
        int index = 0;
        
        // Special case for 0
        if (number == 0) {
            digits[0] = 0;
            index = 1;
        }
        
        // Extract digits
        while (number != 0 && index < MAX_DIGITS) {
            digits[index++] = (int)(number % 10);
            number /= 10;
        }
        
        // Initialize both to smallest possible
        int largest = -1;          // Since digits are 0-9
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            int current = digits[i];
            
            // If we find a new largest number
            if (current > largest) {
                secondLargest = largest; // Old largest becomes second
                largest = current;       // Update largest
            } 
            // If current is between largest and second largest
            else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }
        
        // Handle case where all digits are same or only one digit
        if (secondLargest == -1) {
            secondLargest = largest;
        }
        
        System.out.print("Digits: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}