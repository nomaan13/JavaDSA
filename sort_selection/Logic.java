package sort_selection;

import java.util.Scanner;

public class Logic {
    public static int [] selectionSort(int a [] ){
        for (int i = 0 ; i<a.length ; i++){
            int smallest = a[i];
            int min_index = 0;

            for (int j = i+1; j<a.length ; j++){
                if (a[i] < smallest) {
                    smallest = a[i];
                    min_index = j ;
                }
            }
            a[min_index]=a[i];
            a[i] =smallest;
        }
        return  a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a []=new int[n];

        for (int i =0 ; i<n;i++){
            System.out.print("Enter "+(i+1)+" element of the array: ");
            a[i]= sc.nextInt();
        }

        System.out.println("Entered array is: ");
        for (int x : a){
            System.out.print(x+" ");
        }
        selectionSort(a);

        }
}
