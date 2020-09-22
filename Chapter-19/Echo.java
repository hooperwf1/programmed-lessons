import java.util.Scanner;

public class Echo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter word: ");
		String word = scanner.nextLine();

		for(int i = 0; i < word.length(); i++){
			System.out.println(word);
		}


	}	
}
