import java.util.Scanner;

public class PowTester
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
    int result = pow( n );
    System.out.println("pow(" + n + ") is " + result );
  }

  public static int pow(int N){
    if ( N == 0 )
      return 1;
    else
      return 2 * pow(N-1);
  }
}
