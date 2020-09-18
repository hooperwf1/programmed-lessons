import java.util.Scanner;

public class Fantasy {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter Strength (1-10): ");
		int str = scanner.nextInt();
		System.out.print("Enter Health (1-10): ");
		int hp = scanner.nextInt();
		System.out.print("Enter Luck (1-10): ");
		int luck = scanner.nextInt();

		if(luck + str + hp > 14){
			System.out.println("Too many points, defaults given!");
			str = 5;
			hp = 5;
			luck = 5;
		}

		System.out.println(name + ", strength: " + str + ", health: " + hp + ", luck: " + luck);

	}	
}
