import java.util.Scanner;

public class Discount {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter purchases: ");
		int cents = scanner.nextInt();

		cents -= cents * 0.1;

		System.out.println("Discount: " + cents);
	}	
}
