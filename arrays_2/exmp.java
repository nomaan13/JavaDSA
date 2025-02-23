package arrays;

public class exmp {
	

	public static void maxFrequency(int a[]) {
		int n = a.length - 1;
		int max_count = 0;
		int target = 0;

		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j <= n; j++) {

				if (a[i] ==a[j]) {
					count++;
					a[j]=a[n];
					n--;
					j--;
					
					
				}
			}
			
			if (count>max_count) {
				max_count=count;
				target=a[i];
				
				
			}
			

		}
		System.out.println("Element with maximum frequency is : " + target + " appeared  " + max_count + " times. " );

	}

	public static void oddFrequency(int a[]) {
		int n = a.length - 1;

		for (int i = 0; i <= n; i++) {
			int count = 1;
			for (int j = i + 1; j <= n; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;

				}
			}
			if (count % 2 != 0) {
				System.out.println("Element with odd frequency is : " + a[i]);

			}
		}

	}

	public static void appearMoreThanOnce(int a[]) {
		int n = a.length - 1;
		for (int i = 0; i <= n; i++) {
			int count = 1;

			for (int j = i + 1; j <= n; j++) {

				if (a[i] == a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;

				}
			}

			if (count == 1) {
				System.out.println(a[i] + " Appeared only once");

			}

			if (count != 1) {
				System.out.println(a[i] + " Appeared " + count + " times . ");

			}
		}

	}

	public static void findFrequency(int a[]) {
		int n = a.length - 1;

		for (int i = 0; i < n; i++) {
			int count = 1;

			for (int j = i + 1; j < n; j++) {

				if (a[i] == a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;

				}
			}

			System.out.println("Total number of Frequency of " + a[i] + " is : " + count);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 21, 22, 25, 27,50, 23, 24 };
		
//		int i=0;
		int j=arr.length-1;
		
//		while(i<j) {
//			int temp =arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//			i++;
//			j--;
//		}
		
		for(int i=0;i<j;i++ ,j--) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
		for(int x : arr) {
			System.out.print(x+" ");
		}

//		findFrequency(arr);
//		appearMoreThanOnce(arr);
//		oddFrequency(arr);
//		maxFrequency(arr);

	}

}
