public class MaximumElement {
	public static void main(String[] args){
		int[] testArray = {1, 2, 5, 3, 4};
		System.out.println(maxElement(testArray));
	}

	public static int maxElement(int[] array){
		return maxElement(array, 0);
	}

	public static int maxElement(int[] array, int index){
		if(index >= array.length){
			return 0;
		}

		int next = maxElement(array, index+1);
		return array[index] > next ? array[index] : next;
	}
}
