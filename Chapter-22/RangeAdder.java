import java.util.*;

public class RangeAdder {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Low end: ");
		int low = scanner.nextInt();
		System.out.print("High end: ");
		int high = scanner.nextInt();

		int recent = 1, inside = 0, out = 0;
		while(recent != 0){
			System.out.print("Enter data: ");
			recent = scanner.nextInt();

			if(recent <= high && recent >= low){
				inside += recent;
			} else {
				out += recent;
			}
		}

		System.out.println("In range: " + inside);
		System.out.println("Out range: " + out);

	}	
}
