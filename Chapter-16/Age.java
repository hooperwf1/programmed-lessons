import java.util.Scanner;

public class Age {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int time = 0, days = 0;

		System.out.print("Enter years: ");
		int year = scanner.nextInt();
		System.out.print("Enter months: ");
		int month = scanner.nextInt();
		System.out.print("Enter days: ");
		int day = scanner.nextInt();

		days += (year * 365) + day;

		for(int i = 0; i < month; i++){
			if(i != 1){
				days += (i % 2  == 0 ? 1 : 0) + 30;
			} else {
				days += 28;
			}
		}
		
		time = days * 24 * 60 * 60;

		System.out.println("You have lived " + time + " seconds");
		System.out.println("Percent of life: " + (time/2500000000.f) * 100.f);
	}	
}
