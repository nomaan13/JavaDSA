package arrays;

import java.util.Scanner;

public class TargetSum {
	public int pairSum(int[] arr, int target) {
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TargetSum t1 = new TargetSum(); 
		ArrayInput a1 = new ArrayInput();
		int arr[] = a1.getArray();

		System.out.print("\nEnter the target sum : ");
		int target = sc.nextInt();

		int  x =t1.pairSum(arr, target);
		System.out.println("Number of pairs whose sum is " + target +" is : " + x);
		
	}
}
