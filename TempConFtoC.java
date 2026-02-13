import java.util.*;
class TempConFtoC{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Temprature in Farhenheit");
    double Farhenheit = in.nextDouble();
    double celsiusResult = (Farhenheit-32)*5/9;
    System.out.println("The "+Farhenheit+" farhenheit is "+celsiusResult+" celsius");
	}	
}
		
		