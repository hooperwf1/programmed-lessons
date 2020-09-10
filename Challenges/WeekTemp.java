import java.util.Scanner;

public class WeekTemp {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
		int temps[] = new int[7];
		int ans = 0;

		//Collect data
		for (int i = 0; i < 7; i++){
			System.out.print(daysOfWeek[i] + " temp: ");
			temps[i] = Integer.parseInt(scanner.nextLine());

			ans += temps[i];
		}		

		ans /= 7;


		for (int i = 0; i < 7; i++){
			System.out.print(daysOfWeek[i] + ": " + temps[i] + "°F ");
		}

		System.out.println("\b\nWeekly Average: " + ans + "°F");

	}

}
