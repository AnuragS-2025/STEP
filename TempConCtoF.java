import java.util.*;
class TempConCtoF{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Temprature in Celsius");
    double Celsius = in.nextDouble();
    double farhenheitResult = (Celsius * 9 / 5) + 32 ;
    System.out.println("The "+Celsius+" celsius is "+farhenheitResult+" farhenheit");
	}	
}
		
		