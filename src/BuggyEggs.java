import java.util.Scanner;

public class BuggyEggs {

	public static void main(String[] args) {
		//Declare constants and variables, initialize as appropriate
		final float PRICE_PER_DOZEN = (float) 3.25;
		final float PRICE_PER_SINGLE = (float) 0.45;
		int eggs, dozens, singles;
		float dozensCost, singlesCost, totalCost;
		Scanner kbrd = new Scanner(System.in);
		
		//User input
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		
		//Calculations
		singles = eggs % 12;
		dozens = eggs / 12;
		singlesCost = singles * PRICE_PER_SINGLE;
		dozensCost = dozens * PRICE_PER_DOZEN;
		totalCost = singlesCost + dozensCost;
		
		//System output
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + dozens + " dozen at $3.25, or $" + dozensCost);
		System.out.println("And That's also " + singles + " singles at 0.45, or $" + singlesCost);
		System.out.println("Your total cost is $" + totalCost);
		
	
	}

}
