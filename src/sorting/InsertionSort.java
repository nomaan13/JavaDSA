package sorting;

public class InsertionSort {
	
	public void insertionSort(int a[]) {
		
		int n  = a.length;
		
		for (int i = 1; i < n;  i++) {
			int key = a[i];
			int  j =i-1;
			
			
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			for (int k : a) {
				System.out.print(k+"  ");
				
			}
			System.out.println(" : After iteration" +i+":th Iteration ");		
		}
		
		
	}

}
