//WAJP to print the frequency of each element of the array
package array_frequency;
import java.util.Scanner;
public class Frequency_of_Each_Element {
    public static void getFrequency(int []a){
        int n= a.length-1;

        for (int i=0;i<=n;i++){
            int count=1;
            for (int j=i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    int temp=a[j];
                    a[j]=a[n];
                    a[n]=temp;
                    n--;
                    j--;
                }
            }
            System.out.println("Total number of occurrence of "+ a[i]+" is: " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int  n= sc.nextInt();

        int [] a =new int[n];

        for (int i=0;i<a.length;i++){
            System.out.print("Enter the " + (i+1) + " element: " );
            a[i] =sc.nextInt();
        }

        System.out.println("Entered array is: ");
        for (int x:a){
            System.out.print(x+" ");
        }

        System.out.println();
        getFrequency(a);
    }
}
