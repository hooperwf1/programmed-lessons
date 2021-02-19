public class LeastRes {
	public static void main(String args[]){
		System.out.println(leastRes(leastRes(1734, 23) * leastRes(595, 23) * leastRes(347, 23), 23));
	}

	public static int leastRes(int A, int M){
		if(A >= 0 && A < M){
			return A;
		}

		int newA = A < 0 ? A + M : A - M;
		return leastRes(newA, M);
	}
}
