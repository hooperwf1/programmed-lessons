import java.util.Random;

public class SortingTests {
	
	public static Random random = new Random();
	public static final int NUM_TESTS = 10000;
	public static final int DATA_SIZE = 10;
	public static final int RANDOM_RANGE = 100;

	public static void main(String[] args){
		testSort("bubble", NUM_TESTS);
		testSort("selection", NUM_TESTS);
		testSort("insertion", NUM_TESTS);
	}

	public static void testSort(String method, int times){
		for (int i = 0; i < times; i++){
			int[] data = createTestData(DATA_SIZE);
			int[] orig = duplicate(data);

			sortUsing(data, method);

			if(!isSorted(data)){
				printSortErrorMessage(method, data, orig);
				return;
			}
		}

		System.out.println("Successful " + method);
	}

	public static void sortUsing(int[] data, String method){
		if(method.equals("selection")){
			selectionSort(data);
		} else if(method.equals("bubble")){
			bubbleSort(data);
		} else {
			insertionSort(data);
		}
	}

	public static void printSortErrorMessage(String method, int[] data, int[] orig){
		System.out.println("error during " + method);
		System.out.println("Out: ");
		printArray(data);
		System.out.println("Orig: ");
		printArray(orig);
	}

	public static int[] createTestData(int amount){
		int[] data = new int[amount];
		for(int i = 0; i < amount; i++){
			data[i] = random.nextInt(RANDOM_RANGE);
		}
		return data;
	}		

	public static int[] duplicate(int[] data){
		int[] dup = new int[data.length];
		for(int i = 0; i < data.length; i++){
			dup[i] = data[i];
		}
		return dup;
	}

	public static boolean isSorted(int[] data){
		for(int i = 1; i < data.length; i++){
			if(data[i] < data[i-1]){
				return false;
			}	
		}

		return true;
	}

	public static void bubbleSort(int[] data){
		
		while(true){
			boolean hasFlipped = false;

			for(int i = 0; i < data.length - 1; i++){
				if(data[i] > data[i + 1]){
					hasFlipped = true;
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}

			if(!hasFlipped){
				break;
			}
		}

	}	

	public static void selectionSort(int[] data){
		for (int i = 0; i < data.length; i++){
			
			int min = i;
			for(int x = i; x < data.length; x++){
				if(data[x] < data[min]){
					min = x;
				}
			}

			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}

	public static void insertionSort(int[] data){
		for (int i = 1; i < data.length; i++){
		
			boolean keepGoing = true;
			for(int x = i; x > 0 && keepGoing; x--){
				if(data[x-1] > data[x]){
					int temp = data[x-1];
					data[x-1] = data[x];
					data[x] = temp;
				} else {
					keepGoing = false;
				}
			}	
		}
	}

	public static void printArray(int[] data){
		for (int i : data){
			System.out.print(i + " ");
		}

		System.out.println();
	}

}
