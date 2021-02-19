public class GCDTester {
	public static void main(String[] args){
		System.out.println(GCD(6, 9));
	}

	public static int GCD(int N1, int N2){
		if(N1 == 0){
			return N2; 
		}

		return GCD(N2%N1, N1);
	}
}
