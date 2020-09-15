import java.util.Scanner;

public class BigSub {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter String: ");
		String string = scanner.nextLine();
		System.out.print("Enter start: ");
		int start = scanner.nextInt();
		System.out.print("Enter end: ");
		int end = scanner.nextInt();

		String sub = string.substring(start, end);

		System.out.println(string);
		System.out.println(sub);
	}
}
