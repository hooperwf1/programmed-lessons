import java.util.Scanner;

public class UnluckyEvil {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		int currentNum = scanner.nextInt();

		for(int i = 0; i <= currentNum; i++){
			if(Odious.isOdious(i) && Unlucky.isUnlucky(i)){
				System.out.println(i);
			}
		}

	}

}
