import java.util.*;

public class OddInt {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		int sum = 0;
		for(int i = 1; i <= n; i += 2){
			sum += i;
		}

		System.out.println("Sum: " + sum + "\tN^2: " + (n*n));
	}

}
