package sort_bubble;
import java.util.Scanner;
public class Sorting_In_Ascending {
    public static void sortInAscending(int []a){
        int n= a.length-1;

        for (int i=0; i<n;i++){
            for (int j=0;j<n-i;j++){
                if (a[j]>a[j+1]){

                    a[j] =   a[j]+a[j+1];
                    a[j+1] = a[j]-a[j+1];
                    a[j] =   a[j]-a[j+1];
                }
            }
        }
        for (int x:a){
            System.out.print(x+ " ");
        }

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

        System.out.println();
        System.out.println("Array sorted in ascending order: ");
        sortInAscending(a);
    }
}
