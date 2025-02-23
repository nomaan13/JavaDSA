package arrays;

import java.util.Scanner;

public class FrequencyOfElement {

	public int countNoOfOccurence(int[] a, int x) {

		int n = a.length;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count++;
			}

		}
//		System.out.println("Total nu,ber of occurence of " + x + " is : " + count);

		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int p = sc.nextInt();
		int b = 10;

		int arr[] = new int[p];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter elements of array " + (i + 1)+" :");
			arr[i] = sc.nextInt();

		}

		System.out.println("Entered array : ");

		for (int x : arr) {
			System.out.print(x + " ");

		}

		System.out.print("\nTotal number of occurence of " + b +" is : ");
		FrequencyOfElement f1 = new FrequencyOfElement();
		System.out.println(f1.countNoOfOccurence(arr, b));

	}
}
