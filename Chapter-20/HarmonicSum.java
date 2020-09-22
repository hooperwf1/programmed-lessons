import java.util.Scanner;

public class HarmonicSum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("How N: ");
		int n = scanner.nextInt();
	
		double sum = 0;	
		for(int i = 1; i < n+1; i++){
			sum += 1.0f/i;
		}

		System.out.println("The sum is " + sum);

	}	
}
