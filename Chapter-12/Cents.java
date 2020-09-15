import java.util.Scanner;

public class Cents {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input money: ");
		int money = scanner.nextInt();

		System.out.println(money/100 + " dollars and " + money % 100 + " cents");
	}
}
