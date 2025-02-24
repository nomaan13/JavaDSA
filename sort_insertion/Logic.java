package sort_insertion;

import java.util.Scanner;

public class Logic {
    public static void insertionSort(int a[]){
        for (int i=0;i<a.length;i++){
            int key = a[1];
            int j=i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int a [] = new int[n];
        for (int i =0 ; i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }

        for (int x:a){
            System.out.print(x+" ");
        }

        System.out.println();

        insertionSort(a);

    }
}
