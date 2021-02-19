import java.util.Scanner;

public class Pascal {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int row = 0, col = 0;
		System.out.print("Row: ");
		row = scan.nextInt();
		System.out.print("Col: ");
		col = scan.nextInt();

		System.out.println(tri(row, col));
	}

	public static int tri(int row, int col){
		if(col == 0 || col == row){
			return 1;
		}

		return tri(row-1, col-1) + tri(row-1, col);
	}
}
