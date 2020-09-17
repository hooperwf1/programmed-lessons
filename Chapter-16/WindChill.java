import java.util.Scanner;

public class WindChill {
	public static double formula(double temp, double v){
		double ans = 35.74 + 0.6215*temp - 35.75*Math.pow(v, 0.16) + 0.4275*temp*Math.pow(v, 0.16);

		return ans;	
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Wind Speed: ");
		double v = scanner.nextDouble();
		System.out.print("Enter Temperature: ");
		double temp = scanner.nextDouble();

		double chill = v < 3 || temp > 50 ? temp : formula(temp, v);

		System.out.println(chill);

	}	
}
