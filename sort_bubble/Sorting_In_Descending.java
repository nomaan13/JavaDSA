package sort_bubble;

import java.util.Scanner;

public class Sorting_In_Descending {

    public static void sortInDescending(int a []){
        int  n=a.length-1;


        for (int i=0;i<n;i++){
            for (int j =0;j<n-i;j++){
                if (a[j]<a[j+1]){

                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                }
            }
        }
        for (int x:a){
            System.out.print(x+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int a[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter " +(i+1)+" the element: ");
            a[i]=sc.nextInt();

        }
        System.out.print("Entered array is : ");
        for (int q:a){
            System.out.print(q+" ");

        }

        System.out.println();
        System.out.print("Sorted array is : ");
        sortInDescending(a);
    }
}
