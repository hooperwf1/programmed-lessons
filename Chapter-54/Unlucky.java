import java.util.Scanner;

public class Unlucky {

	public static boolean isUnlucky(int num){
		int recent = 0;

		recent = num % 10;
		num /= 10;

		while (num != 0){
			if(num % 10 == 1 && recent == 3){
				return true;
			}

			recent = num % 10;
			num /= 10;
		}

		return false;

	}

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int currentNum = scanner.nextInt();

		while(currentNum >= 0){
			if(isUnlucky(currentNum)){
				System.out.println("Unlucky");
			} else {
				System.out.println("Lucky");
			}

			System.out.print("Enter number: ");
			currentNum = scanner.nextInt();
		}

	}

}
