package arrays;

import java.util.Scanner;

public class ArrayInput {

	public int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter elements in array:");

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter the element " + (i + 1) + " : ");
			a[i] = sc.nextInt();

		}

		System.out.println("Entered elements of array are : ");

		for (int x : a) {
			System.out.print(x + " ");

		}

		return a;
	}

	public static void main(String[] args) {

	}
}
