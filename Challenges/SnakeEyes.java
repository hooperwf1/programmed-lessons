import java.util.*;

public class SnakeEyes {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Enter times to run: ");
		int n = scanner.nextInt();

		final int max = 5;

		int totalscore = 0, totalrolls = 0, morefour = 0;
		for (int i = 0; i < n; i++){

			int roll1 = random.nextInt(max) + 1;
			int roll2 = random.nextInt(max) + 1;
			int currentrolls = 0;

			while(roll1 != roll2){
				totalrolls++;
				currentrolls++;
				totalscore += roll1 + roll2;
				roll1 = random.nextInt(max) + 1;
				roll2 = random.nextInt(max) + 1;
			}

			totalrolls++;
			currentrolls++;

			if(currentrolls > 4){
				morefour++;
			}
		}

		System.out.println("average rolls: \t" + (totalrolls/ (double) n) + "\nAverage score: \t" + (totalscore/ (double) n) + "\nPercent with more than four rolls: \t" + (morefour/ (double) n * 100.f));
	}

}
