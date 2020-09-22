import java.util.Scanner;

public class RangeSum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter low: ");
		int l = scanner.nextInt();
		System.out.print("Enter high: ");
		int h = scanner.nextInt();

		l--;
		int sum = ((h*(h+1))/2) - ((l*(l+1))/2);

		System.out.println("Sum: " + sum);

	}	
}
