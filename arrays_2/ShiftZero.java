package arrays;

public class ShiftZero {

	public static void shiftZero(int[] a) {
		int n = a.length;
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
//				swap
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;

			}

		}

	}

	public static void main(String[] args) {
		int[] a = { 5, 8, 9, 0, 0, 6, 7 };
		shiftZero(a);
		System.out.println("Array after swaping is : ");
		for (int x : a) {
			System.out.print(x + " ");

		}
	}

}
