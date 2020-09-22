import java.util.Scanner;

public class IntegerAdd {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many: ");
		int length = scanner.nextInt();
	
		int sum = 0;	
		for(int i = 0; i < length; i++){
			System.out.print("Enter number: ");
			sum += scanner.nextInt();
		}

		System.out.println("The sum is " + sum);

	}	
}
