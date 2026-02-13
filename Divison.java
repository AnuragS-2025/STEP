import java.util.*;
class Divison{
	public static void main(String a[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = in.nextInt();
		System.out.println("Enter Second Number");
		int num2 = in.nextInt();
		int quotient = num1 / num2;
		int rem = num1 % num2;
		System.out.println("The Quotient is "+ quotient +" and Reminder is " +rem+ " of two number "+num1+ " and "+ num2);
	}
}
		
		