package arrays;

public class MissingNumber {

	public void findMissingNumber(int []a) {
		int n = a.length+1;    //Expected number of elements in array
		
		int sum =0;				//Total Sum will be
		
		int expected_sum = n*(n+1)/2;	//Expected sum will be
		
		
		for(int i=0;i<a.length;i++) {
			sum =	sum+ a[i] ;
		}
		int missing_number = expected_sum - sum ; 
		
		System.out.println(missing_number);
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,3,5,6,7};
		
		MissingNumber m1  = new MissingNumber();
		m1.findMissingNumber(a);
		
	}

	}


