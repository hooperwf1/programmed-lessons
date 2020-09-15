import java.util.Scanner;

public class Ohm {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input volts: ");
		int v = scanner.nextInt();
		System.out.print("Input resistance: ");
		int r = scanner.nextInt();

		System.out.println((v + 0.0)/r);
	}
}
