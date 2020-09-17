import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Item: ");
		String name = scanner.nextLine();
		System.out.print("Enter price: ");
		double itemPrice = scanner.nextDouble();
		System.out.print("Express delivery? (0 = no, 1 = yes): ");
		int fast = scanner.nextInt();

		double price = (itemPrice < 10 ? 2 : 0) + itemPrice;
		
		if(fast == 1){
			price += 3;
		}

		System.out.println("Invoice: \n" + name + "\t\t" + itemPrice + "\nDelivery: \t" + (price - itemPrice) + "\nTotal: \t\t" + price);
	}	
}
