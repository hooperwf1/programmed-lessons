import java.util.*;

public class DrugPotency {
	public static void main(String[] args){
		double effective = 100;
		int month = 0;
		boolean isGood = true;
		
		while (isGood){
			System.out.print("\nMonth: " + month + "\tEffectiveness: " + effective);
			if(effective < 50.0){
				isGood = false;
			}
			effective -= effective * 0.04;
			month++;
		}
		
		System.out.println("\tDISCARDED");

	}	
}
