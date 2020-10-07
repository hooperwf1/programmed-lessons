import java.util.*;

public class SnakeEyes {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Enter times to run: ");
		int n = scanner.nextInt();

		final int max = 6;

		long totalScore = 0;
		int totalRolls = 0, moreFour = 0;
		for (int i = 0; i < n; i++){

			int roll1 = random.nextInt(max) + 1;
			int roll2 = random.nextInt(max) + 1;
			int currentRolls = 0;

			while(roll1 + roll2 != 2){
				totalRolls++;
				currentRolls++;
				totalScore += roll1 + roll2;
				roll1 = random.nextInt(max) + 1;
				roll2 = random.nextInt(max) + 1;
			}

			totalRolls++;
			currentRolls++;

			if(currentRolls > 4){
				moreFour++;
			}
		}

		System.out.println("average rolls: \t" + (totalRolls/ (double) n) + "\nAverage score: \t" + (totalScore/ (double) n) + "\nPercent with more than four rolls: \t" + (moreFour/ (double) n * 100.f));
	}

}
