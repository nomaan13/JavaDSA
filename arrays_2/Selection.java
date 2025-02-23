package arrays;

public class Selection {

	public static void SelectionSort1(int a[]) {

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			int smallest_Element = a[i];
			int index = i;

			for (int j = i + 1; j < n; j++) {
				if (a[j] < smallest_Element) {
					smallest_Element = a[j];
					index = j;

				}
			}
			a[index] = a[i];
			a[i] = smallest_Element;
			
			System.out.println("----------Array after " + i +" iterartion----------- ");
			for (int p : a) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		int a[]= {90,32,45,12,67,88,1,0,22};
		for (int i : a) {
			System.out.print(i+" ");
		}
		
		
		System.out.println("\n=============================================");
		SelectionSort1(a);
		for (int x :a) {
			System.out.print(x+" ");
			
		}
	}

}
