import java.util.Scanner;

class MultiplicationTable1 {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get the integer input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Define an array to store the results
        int[] multiplicationTable = new int[10];

        // Calculate the multiplication table
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the results
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        // Close the scanner
        scanner.close();
    }
}
