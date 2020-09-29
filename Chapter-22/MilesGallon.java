import java.util.*;

public class MilesGallon {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.print("Initial miles: ");
			int init = scanner.nextInt();

			if(init < 0){
				break;
			}

			System.out.print("Final miles: ");
			int fin = scanner.nextInt();
			System.out.print("Gallons: ");
			int gal = scanner.nextInt();

			System.out.println("Miles per gallon: " + ((fin - init)/(double)gal));

		}


	}	
}
