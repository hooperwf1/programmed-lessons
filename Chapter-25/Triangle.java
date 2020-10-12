import java.util.*;

public class Triangle {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		int triangle = 0;
		for (int i = 1; i <= n; i++){
			triangle += i;

			if(Math.sqrt(triangle) % 1 == 0){
				System.out.print(triangle + ", ");
			}
		}
	}

}
