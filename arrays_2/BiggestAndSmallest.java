package arrays;

public class BiggestAndSmallest {

	public void getElement(int[] a) {
		int n = a.length;
		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < n; i++) {
			if (a[i] > largest) {
				largest = a[i];

			}
			if (a[i] < smallest) {
				smallest = a[i];

			}
		}
		System.out.println("\nLargest number is :" + largest);
		System.out.println("Smallest Number is : " + smallest);

	}

	public static void main(String[] args) {
		ArrayInput a1 = new ArrayInput();
		int arr[] = a1.getArray();

		BiggestAndSmallest b1 = new BiggestAndSmallest();
		b1.getElement(arr);
	}
}
