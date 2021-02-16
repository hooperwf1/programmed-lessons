import java.util.Scanner;

public class TriangleTester
{
  public static void main ( String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = scan.nextInt();
    if(n < 0){
	System.out.println("N must be positive");
	return;
    }
    int result = Triangle( n );
    System.out.println("Triangle(" + n + ") is " + result );
  }

  public static int Triangle(int N){
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }
}
