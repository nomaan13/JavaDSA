package arrays;

import java.util.Scanner;

public class FindGivenNumber {
	
	public static int  findElement(int a[] , int target) {
		
		int n = a.length;
		
		for(int i =0 ; i<n ; i++) {
			if (a[i] == target) {
				return i;
			}
		}
		return -1;
		
	}
	

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the element you want to find: ");
		int target = sc.nextInt();
		
		int a[]= {80,32,12,45,66,19};
		
		System.out.println(target +  " is present at index : " + findElement(a, target));
		
		
	}
}
