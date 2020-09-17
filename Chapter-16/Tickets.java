import java.util.Scanner;

public class Tickets {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		final int prices[] = {8, 5, 4, 2};
		int location = 0;

		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		System.out.print("Enter time: ");
		int time = scanner.nextInt();

		if(age <= 13){
			location += 2;
		}	

		if(time < 1700){
			location++;
		}

		System.out.println("Ticket cost: " + prices[location]);
	}	
}
