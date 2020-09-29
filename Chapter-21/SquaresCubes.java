import java.util.Scanner;

public class SquaresCubes {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		int squ = 0;
		for(int i = 1; i <= n; i++){
			squ += i * i;
		}

		int cube = 0;
		for(int i = 1; i <= n; i++){
			cube += i * i * i;
		}

		System.out.println("Squares: " + squ);
		System.out.println("Cubes: " + cube);
	}	
}
