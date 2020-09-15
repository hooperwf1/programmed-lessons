import java.util.Scanner;

public class Log {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter value: ");
		double val = scanner.nextFloat();

		double result = Math.log(val)/Math.log(2);

		System.out.println("Ln: " + result);
	}	
}
