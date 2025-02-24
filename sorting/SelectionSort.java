package sorting;

public class SelectionSort {

	public void selectionSort(int a[]) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			int smallest_value = a[i];
			int smallest_index = i;

			for (int j = i + 1; j < n; j++) {

				if (a[j] < smallest_value) {
					smallest_value = a[j];
					smallest_index = j;

				}

			}
			a[smallest_index] = a[i];
			a[i] = smallest_value;
			
			System.out.println("\nArray after " + i +"th iteration :" );
			for (int j : a) {
				System.out.print(j+    " "  );
			}

		}
	}

}
