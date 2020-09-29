import java.util.Scanner;

public class WedgeOfStars {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Stars: ");
		int star = scanner.nextInt();

		for(int i = star; i > 0; i--){
			for(int x = 0; x < i; x++){
				System.out.print("*");
			}

			System.out.println();
		}

	}	
}
