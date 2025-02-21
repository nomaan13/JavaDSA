package array_frequency;
import java.util.Scanner;
public class Frequency_of_Even {
    public static void getOnlyElement(int []a){
        int n= a.length-1;

        for (int i=0;i<=n;i++){
            int count=1;
            for (int j=i+1;j<=n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=a[n];
                    n--;
                    j--;
                }
            }

            if (count==1){
                System.out.println(a[i]);
            }
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();

        int [] x = new int[n];

        for (int i= 0;i<x.length;i++){
            System.out.print("Enter the " + (i+1) +" element: ");
            x[i] = sc.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int y:x){
            System.out.print(y +" ");

        }
        System.out.println();
        System.out.print("The element which appeared only once is: ");
        getOnlyElement(x);


    }
}
