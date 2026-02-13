import java.util.*;
class ProfitLoss{
	public static void main(String a[]){
		double cp = 129.0,sp = 191.0;
		System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
		double profit = sp-cp;
		double pp = (profit/cp)*100;
		System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+pp);
	}
}
		