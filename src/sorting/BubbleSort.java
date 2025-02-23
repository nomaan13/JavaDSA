package sorting;

public class BubbleSort {
	
	public void bubbleSort(int a[]) {
		int n = a.length-1;
		
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0	; j <n-i; j++) {
				if (a[j]>a[j+1]) {
					int temp= a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
		}
		
	}

}
