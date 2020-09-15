import java.util.Scanner;

public class ApplianceCost {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter cost: ");
		double cost = scanner.nextFloat();

		System.out.print("Enter time: ");
		double time = scanner.nextFloat();

		System.out.println("Annual cost: " + time/cost);
	}	
}
