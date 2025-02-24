package sort_bubble;
import java.util.Scanner;
public class Question_22 {
    public static int[] sortArray(int [] a){
        int half = a.length/2;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<half-1;j++){
                if (a[j] > a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                }
            }
            for (int j =half ;j<a.length-1;j++){
                if (a[j]<a[j+1]){
                    a[j] = a[j] + a[j+1];
                    a[j] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];

                }
            }
        }
        return a ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int  n = sc.nextInt();
        int a[]= new int[n];

        for (int i=0;i<n;i++){
            System.out.print("Enter " + (i+1)+" the array element: ");
            a[i]= sc.nextInt();
        }

        System.out.println("Entered array is: ");
        for (int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Sorted array is: ");

        sortArray(a);

    }
}
