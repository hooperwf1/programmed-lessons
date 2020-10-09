import java.util.*;

public class SumDivisors {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		int sum = 0;
		for(int i = 1; i <= (n/2.f); i++){
			if(n % i == 0){
				sum += i;
			}
		}

		System.out.println("Sum: " + sum);
		
		if(sum == n){
			System.out.println("Is perfect number");
		}
	}

}
