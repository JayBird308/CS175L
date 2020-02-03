import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Input all variables necessary for calculation
		System.out.print("Enter the width of the house: ");
		int houseWidth = scan.nextInt();
		System.out.print("Enter the length of the house: ");
		int houseLength = scan.nextInt();
		System.out.print("Enter the height of the house: ");
		int houseHeight = scan.nextInt();
		System.out.print("Enter the width of the windows: ");
		int windowWidth = scan.nextInt();
		System.out.print("Enter the length of the windows: ");
		int windowLength = scan.nextInt();
		System.out.print("Enter the width of the doors: ");
		int doorWidth = scan.nextInt();
		System.out.print("Enter the length of the doors: ");
		int doorLength = scan.nextInt();
		System.out.print("Enter the number of windows: ");
		int windowNumb = scan.nextInt();
		System.out.print("Enter the number of doors: ");
		int doorNumb = scan.nextInt();
		System.out.print("Enter the cost of paint per Square Foot: ");
		int paintPrice = scan.nextInt();
		
		//Calculate Square Feet of the window surfaces
		double windowArea= (windowWidth*windowLength);
		
		//Calculate Square Feet of the door surfaces
		double doorArea= (doorWidth*doorLength);
		
		//Calculate Square Feet of house faces without peaks
		double peaklessArea= (houseWidth*houseLength);
		
		//Output the height of the house peak using house height and house width
		double peakHeight= (houseHeight-houseWidth);
		
		//Calculate Square Feet of the house faces with peaks
		double peakArea= ((houseWidth*houseLength)+(peakHeight*houseLength)/2);
		
		//Calculate Total Square Feet of all sides
		double totalfaceArea= (2*peakArea)+(2*peaklessArea);
		
		//Determine the area of the non-painted surfaces
		double totalwindowArea= (windowArea*windowNumb);
		double totaldoorArea= (doorArea*doorNumb);
		
		//Subtract the area of non-painted surfaces from Total Square Feet
		double paintedfaceArea=(totalfaceArea-(totaldoorArea+totalwindowArea));
		
		//Calculate cost of Paint Job
		double totalCost= (paintedfaceArea*paintPrice);
		
		//Print the total Square Feet and Paint Job Cost
		System.out.print("Total Square Feet of House: ");
		System.out.println(totalfaceArea);
		System.out.print("Total Square Feet of Paint needed for the House: ");
		System.out.println(paintedfaceArea);
		System.out.print("Total Paint Job Cost ($): ");
		System.out.print(totalCost);
		
	}

}
