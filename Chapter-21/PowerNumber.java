import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter X: ");
		double x = scanner.nextDouble();
		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		double answer = 1;
		if(n < 0){
			System.out.println("N must be positive int");
		} else {
			for(int i = 0; i < n; i++){
				answer *= x;
			}

			System.out.println("Answer: " + answer);
		}

	}	
}
