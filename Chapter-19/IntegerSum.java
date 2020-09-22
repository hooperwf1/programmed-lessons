import java.util.Scanner;

public class IntegerSum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		int sum = 0, equ = 0;

		equ = (n*(n+1))/2;

		for(int i = 1; i <= n; i++){
			sum += i;
		}

		System.out.println("Loop Sum: " + sum);
		System.out.println("Formula Sum: " + equ);

	}	
}
