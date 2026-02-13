import java.util.*;
class Handshakes {
  public static void main(String a[]) {
      // Create a Scanner object to take input from the user
      Scanner in = new Scanner(System.in);
      // Taking user input for the number of students
      System.out.print("Enter the number of students: ");
      int numberOfStudents = in.nextInt();
      // Calculating the maximum number of handshakes
      int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
      // Displaying the result
      System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes + ".");
      // Close the Scanner object to avoid resource leak
      in.close();
  }
}