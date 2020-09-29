import java.util.*;

public class Multiplication {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int correct = 0;
		for (int i = 0; i < 10; i++){
			int first = random.nextInt(10);
			int second = random.nextInt(10);

			System.out.print("What is " + first + " * " + second + ": ");
			int n = scanner.nextInt();

			if(n == first * second){
				System.out.println("Right");
				correct++;
			} else {
				System.out.println("Wrong: " + (first * second));
			}
		}

		System.out.println("You got " + correct + " out of 10 correct");

	}	
}
