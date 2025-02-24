package sorting;

public class MyArray {
	public static void main(String[] args) {
		int arr[] = {5,11,80,9,0,6};
		System.out.println("Original array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nSorted array : ");
		
//		System.out.println("========================Selection Sort Algorithm========================================");
//		SelectionSort s1 = new SelectionSort();
//		s1.selectionSort(arr);
		
		
//		System.out.println("========================Insertion Sort Algorithm========================================");
//		InsertionSort x1 = new InsertionSort();
//		x1.insertionSort(arr);
//		System.out.println("\nfinal output : ");

		
		
		System.out.println("========================Bubble Sort Algorithm========================================");
		BubbleSort b1 = new BubbleSort();
		b1.bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
