package example.bubblesort;

public class BubbleSortImpl {

	public static void main(String[] args) {

		int[] array = { 20, 35, -15, 7, 55, 1, -22 };

		for (int unsertedArray = array.length - 1; unsertedArray > 0; unsertedArray--) {
			for (int i = 0; i < unsertedArray; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void swap(int[] array, int i, int j) {

		if (array[i] == array[j]) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
