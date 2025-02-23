package arrays;

public class BarChart {
	
	public static void barChart(int a[]) {
		int n = a.length;
		int max =a[0];
		
		
		
		for(int i =0;i<n;i++) {
			if (a[i]>max) {
				max = a[i];
				
			}
		}
		
		
		
		for(int floor= max ; floor>=1;floor--) {
			for(int i =0;i<n;i++) {
				if(a[i]>=floor) {
					System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
			
		 
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int a[] = {4,5,6,1,2,0,10};
		
		barChart(a);
	}

}
