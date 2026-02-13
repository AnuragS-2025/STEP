import java.util.*;
class DoubleOpt{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number");
		double a = in.nextInt();
		System.out.println("Enter Second Number");
		double b = in.nextInt();
		System.out.println("Enter Third Number");
		double c = in.nextInt();
		double res1 = a + b *c;
		double res2 = a * b +c;
		double res3 = c + a /b;
		double res4 = a % b +c;
		System.out.println("The results of Operations are " +res1+" ,"+res2+" ,"+res3+" ,"+res4);
	}
}
		
		