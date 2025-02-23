package arrays;

public class KthLargestElement {

	public void largestElementK(int a[], int position) {
		int n = a.length;
		int temp;

		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

			if (i == position - 1) {
				System.out.println(a[i]);
				break;
			}
		}

	}

	public void selectionSorting(int a[]) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int smallestElement = a[i];
			int index = i;

			for (int j = i+1; j < n; j++) {
				
				if (smallestElement > a[j]) {
					smallestElement = a[j];
					index = j;

				}

			}
			a[index]=a[i];
			a[i]=smallestElement;

		}

	}

	public static void main(String[] args) {
		int a[] = { 5, 8, 9, 6, 0, 11, 71, 56, 50, 61, 29 };
		int position = 5;

		KthLargestElement k1 = new KthLargestElement();

		k1.selectionSorting(a);
		for (int i : a) {
			System.out.print(i+" ");
			
		}
		

		System.out.print("\n"+position + " th Largest element in array is : ");
		k1.largestElementK(a, position);

	}

}
