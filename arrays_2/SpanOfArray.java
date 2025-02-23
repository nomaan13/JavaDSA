package arrays;

public class SpanOfArray {
	public int getSpan(int a []) {
		
		int n = a.length;
		int biggest_element = Integer.MIN_VALUE;
		int smallest_element = Integer.MAX_VALUE;
		
		
		for(int  i = 0 ; i<n ; i++)
		{
			
			if (a[i]> biggest_element ) {
				biggest_element =a[i];
				
			}
			if (a[i]<smallest_element) {
				smallest_element=a[i];
				
			}
			
		}
		
		int span = biggest_element - smallest_element;
		
		
		
		return span ;
		
	}
	
	public static void main(String[] args) {
		int a []= {10,5,30,50,21};
		SpanOfArray s1 = new SpanOfArray();
		
		System.out.println(s1.getSpan(a));
;		
	}

}
