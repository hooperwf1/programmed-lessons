import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter X: ");
		double x = scanner.nextFloat();
		System.out.print("Enter Y: ");
		double y = scanner.nextFloat();

		double Havg = 2/((1/x)+(1/y)), Aavg = (x + y)/2;

		System.out.println("Harmonic: " + Havg);
		System.out.println("Arimetic: " + Aavg);
	}	
}
