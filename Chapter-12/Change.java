import java.util.Scanner;

public class Change {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input money: ");
		int money = scanner.nextInt(), oldMoney = 0;
		oldMoney = money;
		
		int q = 0, d = 0, n = 0, p = 0, dollar = 0;

		dollar = money/100;
		money -= (money/100) * 100;
		q = (money/25);
		money -= (money/25) * 25;
		d = (q/10) * 10;
		money -= (money/10) * 10;
		n = (n/5) * 10;
		money -= (money/5) * 5;
		p = money;

		System.out.println(dollar + " " + q + " " + d + " " + n + " " + p);


	}
}
