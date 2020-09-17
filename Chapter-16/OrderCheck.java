import java.util.Scanner;

public class OrderCheck {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		final int boltPrice = 5, nutPrice = 3, washerPrice = 1;

		System.out.print("Enter bolts: ");
		int bolts = scanner.nextInt();
		System.out.print("Enter nuts: ");
		int nuts = scanner.nextInt();
		System.out.print("Enter washer: ");
		int washers = scanner.nextInt();

		if(nuts < bolts){
			System.out.println("Too few nuts");
		} else if (washers < bolts * 2){
			System.out.println("Too few washers");
		} else {
			System.out.println("Order OK");
		}

		int cents = (bolts * boltPrice) + (nuts * nutPrice) + washers;

		System.out.println("Total cost: " + cents);
	}	
}
