import java.util.Scanner;

public class Odious {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int currentNum = scanner.nextInt();

		while(currentNum >= 0){
			int ones = 0;

			if(currentNum % 2 == 1){
				ones++;
			}

			currentNum /= 2;

			while (currentNum != 0){
				if(currentNum % 2 == 1){
					ones++;
				}

				currentNum /= 2;
			}

			if(ones % 2 == 1){
				System.out.println("Odious");
			} else {
				System.out.println("Evil");
			}

			System.out.print("Enter number: ");
			currentNum = scanner.nextInt();
		}

	}

}
