import java.util.Scanner;

class Jam
{
  // Instance Variables
  private String contents ;   // type of fruit in the jar
  private String date  ;      // date of canning
  private int capacity ;      // amount of jam in the jar


  // Constructors
  public Jam( String contents, String date, int size )
  {
    this . contents = contents  ;
    this . date = date ;
    capacity = size;
  }

  // Methods
  public boolean empty ()
  {
    return ( capacity== 0 ) ;
  }

  public String toString()
  {
    return contents + "   " +  date + "   " +  capacity + " fl. oz."  ;
  }

  public void spread ( int fluidOz )
  {
    if ( !empty() )
    {
      if ( fluidOz <= capacity )
      {
        System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents );
        capacity = capacity - fluidOz ;
      }
      else
      {
        System.out.println("Spreading " + capacity + " fluid ounces of " + contents );
        capacity =  0 ;
      }
     }
     else
       System.out.println("No jam in the Jar!");
  }

}

class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";
    str += "2: " +  jar2.toString()  + "\n";
    str += "3: " +  jar3.toString()  + "\n";     
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public void select( int jarNumber )
  {
    if ( jarNumber == 1 )
      selected =  jar1 ;

    else if ( jarNumber == 2 )
      selected = jar2 ;

    else 
      selected = jar3 ;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
}

public class PantryTester
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