package arrays;

public class SortedArray {

	public boolean isSorted(int[] a) {

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				return true;

			}
		}

		return false;

	}

	public static void main(String[] args) {

		SortedArray s1 = new SortedArray();
		
		ArrayInput a1 = new ArrayInput();

		int []n=a1.getArray();
		
		System.out.println("\nArray is sorted : "+ s1.isSorted(n));
	}

}
