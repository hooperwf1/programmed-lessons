import java.util.*;

public class SheepHerd {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		double power = 1;
		int years = -1;
		for (int i = 0; i < 26; i++){
			double sheep = 220/(1 + 10 * power);
			System.out.println("t: " + i + " Sheep: " + sheep);
			if (sheep >= 80 && years < 0){
				years = i;
			}

			power *= 0.83;
		}

		System.out.println("Sheep need " + years + " years");
	}

}
