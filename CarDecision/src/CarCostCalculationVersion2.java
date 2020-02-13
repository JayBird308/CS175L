import java.util.Scanner;
import java.lang.Number;

public class CarCostCalculationVersion2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Input Cost and Upkeep variables of Regular Car
		System.out.println("Enter information for the Regular Car: ");
		String regularCar = scan.nextLine();
		String regularCostString = regularCar.substring(15,20);
		int regularCost = Integer.parseInt(regularCostString);
		
		//Input Cost and Upkeep variables of Hybrid Car
		System.out.println("Enter information for the Hybrid Car: ");
		String hybridCar = scan.nextLine();
		String hybridCostString = hybridCar.substring(13,18);
		int hybridCost = Integer.parseInt(hybridCostString);
		
		//Enter Miles Traveled
		System.out.println("Enter miles traveled in a year: ");
		int milesTraveled = scan.nextInt();
		
		//Enter Cost per gallon
		System.out.println("Enter cost per gallon of gas: ");
		float gasPrice = scan.nextFloat();
		
		//Evaluate yearly cost of Regular Car
		String mpgStringRegular = regularCar.substring(21,23);
		int mpgRegular = Integer.parseInt(mpgStringRegular);
		double yearlyRegularCost = (milesTraveled*(gasPrice/mpgRegular));
		
		//Evaluate yearly cost of Regular Car
		String mpgStringHybrid = hybridCar.substring(19,21);
		int mpgHybrid = Integer.parseInt(mpgStringHybrid);
		double yearlyHybridCost = (milesTraveled*(gasPrice/mpgHybrid));
		
		//Pull substring Vehicle name out of Main String
		String regularName = regularCar.substring(0,14);
		String hybridName = hybridCar.substring(0,12);
		
		//Evaluate cost to own for both cars through 5 years
		System.out.println("Cost to own " + regularName + " after year 1: " + (regularCost+(yearlyRegularCost) + " for " + hybridName + ": " + (hybridCost+(yearlyHybridCost))));
		System.out.println("Cost to own " + regularName + " after year 2: " + (regularCost+(yearlyRegularCost*2) + " for " + hybridName + ": " + (hybridCost+(yearlyHybridCost*2))));
		System.out.println("Cost to own " + regularName + " after year 3: " + (regularCost+(yearlyRegularCost*3) + " for " + hybridName + ": " + (hybridCost+(yearlyHybridCost*3))));
		System.out.println("Cost to own " + regularName + " after year 4: " + (regularCost+(yearlyRegularCost*4) + " for " + hybridName + ": " + (hybridCost+(yearlyHybridCost*4))));
		System.out.println("Cost to own " + regularName + " after year 5: " + (regularCost+(yearlyRegularCost*5) + " for " + hybridName + ": " + (hybridCost+(yearlyHybridCost*5))));
		double regularinvest = regularCost+(yearlyRegularCost*5);
		double hybridinvest = hybridCost+(yearlyHybridCost*5);
		
		if (hybridinvest < regularinvest)
		{
			System.out.println("The " + hybridName + " pays back after 5 years");
		}
		

	
	}

}
