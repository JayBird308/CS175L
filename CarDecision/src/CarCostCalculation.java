import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Input Cost and Upkeep variables of Regular Car
		System.out.println("Enter Cost of regular car: ");
		int regularCarCost = scan.nextInt();
		System.out.println("Enter Miles per gallon of regular car: ");
		int mpgRegularCar = scan.nextInt();
		
		//Input Cost and Upkeep variables of Hybrid Car
		System.out.println("Enter Cost of hybrid car: ");
		int hybridCarCost = scan.nextInt();
		System.out.println("Enter Miles per gallon of hybrid car: ");
		int mpgHybridCar = scan.nextInt();
		
		//Input variables for miles traveled and cost per gallon of gas
		System.out.println("Enter miles traveled in a year: ");
		int milesTraveled = scan.nextInt();
		System.out.println("Enter cost per gallon of gas: ");
		double costGas = scan.nextDouble();
		
		//Evaluate yearly cost of Regular Car
		double yearlyRegularCost = (milesTraveled*(costGas/mpgRegularCar));
		
		//Evaluate yearly cost of Hybrid Car
		double yearlyHybridCost = (milesTraveled*(costGas/mpgHybridCar));
		
		//Evaluate cost to own for both cars through 5 years
		System.out.println("Cost to own after year 1 for regular car: "+(regularCarCost+(yearlyRegularCost)) + " for hybrid car: " + (hybridCarCost+(yearlyHybridCost)));
		System.out.println("Cost to own after year 2 for regular car: "+(regularCarCost+(yearlyRegularCost*2)) + " for hybrid car: " + (hybridCarCost+(yearlyHybridCost*2)));
		System.out.println("Cost to own after year 3 for regular car: "+(regularCarCost+(yearlyRegularCost*3)) + " for hybrid car: " + (hybridCarCost+(yearlyHybridCost*3)));
		System.out.println("Cost to own after year 4 for regular car: "+(regularCarCost+(yearlyRegularCost*4)) + " for hybrid car: " + (hybridCarCost+(yearlyHybridCost*4)));
		System.out.println("Cost to own after year 5 for regular car: "+(regularCarCost+(yearlyRegularCost*5)) + " for hybrid car: " + (hybridCarCost+(yearlyHybridCost*5)));
		double regularInvest = (regularCarCost+(yearlyRegularCost*5));
		double hybridInvest = (hybridCarCost+(yearlyHybridCost*5));
		
		//Evaluate If statement after 5 years
		if (hybridInvest < regularInvest) 
		{
		System.out.print("The hybrid car pays back after 5 years");
		}
		
	}

}
