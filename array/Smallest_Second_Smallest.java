//WAJP to print the smallest and Second-Smallest element of a Array?
package array;
import java.util.Scanner;
public class Smallest_Second_Smallest {
    public static void getElement(int [] a )
    {
        int smallest = a[0];
        int second_smallest=a[1];

        for (int i =1;i<a.length;i++){
            if (a[i]<smallest){
                smallest=second_smallest;
                smallest=a[i];


            }
            else if (a[i]<second_smallest && a[i] > smallest) {
                second_smallest = a[i];


            }
        }
        System.out.println(smallest);
        System.out.println(second_smallest);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("ENter the length of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0 ; i<n;i++){
            System.out.print("Enter the "+(i+1)+" element: ");
            a[i]= sc.nextInt();
        }

        for (int x:a){
            System.out.print(x+" ");
        }

        System.out.println(" ");
        getElement(a);

    }
}
