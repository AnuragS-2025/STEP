import java.util.*;
class FeeStructure{
	public static void main(String a[]){
		int fee=125000,discountPercent=10;
		int discount=(discountPercent*fee)/100;
		int ff=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ff);
	}
}