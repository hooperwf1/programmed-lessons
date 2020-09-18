import java.util.Scanner;

public class Microwave {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number Items: ");
		int num = scanner.nextInt();
		System.out.print("Enter time for each: ");
		int timeLong = scanner.nextInt();
	
		int secs = 0, newTime = 0;
		secs = ((timeLong/100) * 60) + (timeLong % 100);

		switch (num) {
			case 1:
				newTime = secs;
				break;

			case 2:
				newTime = secs + (secs/2);
				break;

			case 3:
				newTime = 2 * secs;
				break;

			default:
				System.out.println("Invalid number of items");
				return;
		}

		System.out.println("Heat for " + (newTime/60) + " minutes " + (newTime % 60) + " seconds" );
	}	
}
