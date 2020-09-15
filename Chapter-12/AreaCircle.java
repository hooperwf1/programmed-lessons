import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input radius: ");
		int rad = scanner.nextInt();

		System.out.println(Math.PI * rad * rad);
	}
}
