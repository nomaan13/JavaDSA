package arrays;

import java.util.Scanner;

public class TargetSumOfThree {

	public int tripletSum(int arr[], int target) {
		int count = 0;

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {

					if (arr[i] + arr[j] + arr[k] == target) {

						count++;
					}
				}

			}
		}

		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TargetSumOfThree t1 = new TargetSumOfThree();
		ArrayInput a1 = new ArrayInput();

		
		int a []= a1.getArray();
		System.out.print("\nEnter target : ");
		int target = sc.nextInt();
		
		System.out.println("Number of triplet whose sum is " + target +" is : " + t1.tripletSum(a, target));
		
	}

}
