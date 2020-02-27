import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class GroceryDiscount {
	
	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the cost of your groceries or '0' to quit: ");
		double groceryCost = scan.nextFloat();
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		
		if (groceryCost > 0 && groceryCost < 10)
		{
			System.out.println("You are not eligible for a coupon this time");
		}
		else if (groceryCost >= 10 && groceryCost <= 60)
		{
			System.out.println("You win a discount coupon of $" + df.format(groceryCost*0.08) + ". (8% of your purchase)");
		}
		else if (groceryCost > 60 && groceryCost <= 150)
		{
			System.out.println("You win a discount coupon of $" + df.format(groceryCost*0.10) + ". (10% of your purchase)");
		}
		else if (groceryCost > 150 && groceryCost <= 210)
		{
			System.out.println("You win a discount coupon of $" + df.format(groceryCost*0.12) + ". (12% of your purchase)");
		}
		else if (groceryCost > 210)
		{
			System.out.println("You win a discount coupon of $" + df.format(groceryCost*0.14) + ". (14% of your purchase)");
		}
		
		
		}
	}
