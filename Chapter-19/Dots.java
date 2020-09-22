import java.util.Scanner;

public class Dots {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter 1st word: ");
		String one = scanner.nextLine();
		System.out.print("Enter 2nd word: ");
		String two = scanner.nextLine();

		System.out.print(one);

		for(int i = 0; i < 30 - (one.length() + two.length()); i++){
			System.out.print(".");
		}

		System.out.println(two);

	}	
}
