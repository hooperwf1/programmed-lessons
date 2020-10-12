import java.util.*;

public class Birthday {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Guests: ");
		int n = scanner.nextInt();

		double prob = 1, half = 0;
		for(int i = 1; i < n; i++){
			prob = prob * ((365 - i)/365.f);
			if(prob < 0.5f && half == 0){
				half = i + 1;
			}
		}

		System.out.println("Chance: " + prob + " Guests for 50%: " + half);
	}

}
