package arrays;

import java.util.Scanner;

public class IndexOfLastOccurence {

	public int lastOccurence(int[] a, int x) {
		int n = a.length;
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				index = i;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IndexOfLastOccurence p1 = new IndexOfLastOccurence();

		System.out.print("Enter length of Array : ");
		int b = sc.nextInt();

		int[] arr = new int[b];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element " + (i + 1) + " - ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Entered Array is : ");
		for (int p : arr) {
			System.out.print(p + " ");

		}

		System.out.print("\nEnter element to find : ");
		int c = sc.nextInt();

		System.out.println("Last index where " + c + " occure is : " + p1.lastOccurence(arr, c));

	}

}
