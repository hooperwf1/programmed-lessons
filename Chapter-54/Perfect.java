import java.util.Scanner;

public class Perfect {

	public static boolean isPerfect(int num){
		int sum = 0;

		for(int i = 1; i < num; i++){
			if(num % i == 0){
				sum += i;
			}
		}

		return sum == num;
	}

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int currentNum = scanner.nextInt();

		for(int i = 1; i < currentNum; i++){
			if(isPerfect(i)){
				System.out.println(i);
			}
		}
	}

}
