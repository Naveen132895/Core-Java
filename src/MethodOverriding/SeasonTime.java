package MethodOverriding;

public class SeasonTime extends Hotel{

	public int hotelBillCalculation(int rent,int days)
	{
		int bill;
		bill=super.hotelBillCalculation(rent,days);
		return bill+(50*bill)/100;
	}
	

	
}
