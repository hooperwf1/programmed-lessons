import java.util.Scanner;

public class AvgStandardDeviation {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("How N: ");
		int n = scanner.nextInt();
		
		double avg = 0, avgSquare = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Enter value: ");
			double temp = scanner.nextDouble();

			avg += temp;
			avgSquare += temp * temp;
		}

		avg /= n;
		avgSquare /= n;

		double SD = Math.sqrt(avgSquare - (avg * avg));
	
		System.out.println("The average is " + avg);
		System.out.println("The Standard Deviation is " + SD);

	}	
}
