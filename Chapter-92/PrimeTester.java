public class PrimeTester {
	public static void main(String[] args){
		System.out.println(prime(7));
	}

	public static boolean prime(int N){
		return prime(N, N-1);
	}

	public static boolean prime(int N1, int N2){
		if(N2 == 1){
			return true;
		}

		return N1 % N2 == 0 ? false : prime(N1, N2-1);
	}
}
