import java.util.Scanner;

public class BrickTravel {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter time: ");
		double time = scanner.nextFloat();

		double distance = (0.5 * 32.174 * time * time);

		System.out.println("Distance: " + distance);
	}	
}
