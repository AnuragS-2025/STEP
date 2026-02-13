import java.util.*;
class ArrayConverter {
  public static void main(String a[]) {
      Scanner in = new Scanner(System.in);
	  System.out.print("Enter number of rows: ");
      int rows = in.nextInt();        
      System.out.print("Enter number of columns: ");
      int columns = in.nextInt();
      int matrix[][] = new int[rows][columns];
      System.out.println("Enter matrix elements:");
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              matrix[i][j] = in.nextInt();
          }
      }
      int array[] = new int[rows * columns];
      int index = 0;     
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              array[index++] = matrix[i][j];
          }
      }
      System.out.println("1D Array:");
      for (int num : array) {
          System.out.print(num + " ");
      }
   }
}