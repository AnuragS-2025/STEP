import java.util.*;

class NumberCheck3 {
    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter numbers (0 or negative to stop, max 10 numbers):");
        while (true) {
            System.out.print("Number " + (index + 1) + ": ");
            double num = in.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            numbers[index] = num;
            index++;
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nTotal sum: " + total);
        in.close();
    }
}
