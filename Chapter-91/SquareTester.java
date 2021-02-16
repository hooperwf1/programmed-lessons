import java.util.Scanner;

public class SquareTester
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
    int result = square( n );
    System.out.println("square(" + n + ") is " + result );
  }

  public static int square(int N){
    if ( N == 1 )
      return 1;
    else
      return square(N - 1) + 2 * N - 1;
  }
}
