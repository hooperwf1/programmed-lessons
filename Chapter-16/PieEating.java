import java.util.Scanner;

public class PieEating {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight: ");
		int weight = scanner.nextInt();


		if(Math.abs(250 - weight) > 30){
			System.out.println("Out of weight range!");
		} else {
			System.out.println("OK to compete");
		}
	}	
}
