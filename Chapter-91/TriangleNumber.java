import java.util.Scanner;

public class TriangleNumber
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
    int result = triangleNumber( n );
    System.out.println("triangleNumber(" + n + ") is " + result );
  }

  public static int triangleNumber(int N){
    if ( N == 1 || N == 0 )
      return N;
    else
      return 3 * triangleNumber(N/2) + triangleNumber(N%2 == 1 ? N/2 + 1 : N/2 - 1);
  }
}
