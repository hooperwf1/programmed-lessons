import java.util.Scanner;

public class Exercise1 
{
  public static void main ( String[] args )
  {
    Scanner scanner = new Scanner(System.in);
	  
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry( goose, apple, rhub );
    System.out.println( hubbard );

    int selection = 0;
    System.out.print("Enter jam: ");
    selection = scanner.nextInt();

    while(selection != -1){
	    int spread = 0;
	    System.out.print("Enter spread: ");
	    spread = scanner.nextInt();

	    hubbard.select(selection);
	    hubbard.spread(spread);
	    System.out.println( hubbard );

	    System.out.print("Enter jam: ");
	    selection = scanner.nextInt();
    }
  }
}
