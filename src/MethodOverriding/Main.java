package MethodOverriding;

public class Main {

	public static void main(String[] args) {
		int rent=1000;
		int days=5;
		Hotel season=new SeasonTime();
		System.out.println(season.hotelBillCalculation(rent, days));

	}

}
