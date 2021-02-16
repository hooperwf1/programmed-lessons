import java.util.Scanner;

public class LogTester
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
    int result = log( n );
    System.out.println("log(" + n + ") is " + result );
  }

  public static int log(int N){
    if ( N == 1 )
      return 0;
    else
      return 1 + log(N/2);
  }
}
