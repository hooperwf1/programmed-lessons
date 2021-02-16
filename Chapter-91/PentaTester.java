import java.util.Scanner;

public class PentaTester
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
    int result = penta( n );
    System.out.println("penta(" + n + ") is " + result );
  }

  public static int penta(int N){
    if ( N == 1 )
      return 1;
    else
      return penta(N-1) + 3 * N - 2;
  }
}
