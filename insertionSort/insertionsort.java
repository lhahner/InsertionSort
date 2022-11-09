package insertionSort;

public class insertionsort {
	public static void main(String[] args) {
		int[] array = {21, 2, 1, 2, 4, 12, 54};
		printArray(array);
		insertionSort(array);
		printArray(array);
	}
	
	public static void insertionSort(int[] array) {
		for(int i =0; i<array.length; i++) {
			for(int j = array.length-1; j>0; j--) {
				if(array[j-1] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(i + ") " + array[i]);
		}
	}
}
