public class SumTester {
	public static void main(String args[]){
		int[] testArray = {1, 2, 3, 4, 5};
		System.out.println(sum(testArray));
	}

	public static int sum(int[] array){
		return sum(array, 0);
	}

	public static int sum(int[] array, int index){
		if(index == array.length){
			return 0;
		}

		return array[index] + sum(array, index+1);
	}	
}
