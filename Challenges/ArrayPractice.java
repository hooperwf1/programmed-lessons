public class ArrayPractice {
	
	public static void main(String[] args){
		int[] data = {1, 5, 3, 2, 0};		

		swapEnds(data);
		printArray(data);

		System.out.println(haveSeven(data));

		System.out.println(mean(data));

		reverse(data);
		printArray(data);

		System.out.println(search(data, 1));

		insertionSort(data);
		printArray(data);

		int[] data2 = {1, 9, 34, 2, 8};
		bubbleSort(data2);
		printArray(data2);

		int[] data3 = {1, 9, 34, 2, 8};
		selectionSort(data3);
		printArray(data3);
	}

	public static void swapEnds(int[] data){
		int temp = data[data.length - 1];
		data[data.length - 1] = data[0];
		data[0] = temp;
	}

	public static boolean haveSeven(int[] data){
		for (int i : data){
			if(i == 7){
				return true;
			}
		}

		return false;
	}

	public static double mean(int[] data){
		int total = 0;

		for (int i : data){
			total += i;
		}

		return total/data.length;
	}

	public static void reverse(int[] data){
		int temp[] = new int[data.length];

		for (int i = data.length - 1; i > -1; i--){
			temp[data.length - 1 - i] = data[i];
		}

		for(int i = 0; i < data.length; i++){
			data[i] = temp[i];
		}
	}

	public static int search(int[] data, int needle){
		for (int i = 0; i < data.length; i++){
			if (data[i] == needle){
				return i; 
			}
		}

		return -1;
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
