//WAJP to print the biggest and second-biggest element of the array
package array;
import java.util.Scanner;
public class Biggest_Second_Biggest {
    public static void getElement(int [] a){
        int biggest=a[0];
        int secondBiggest=a[1];

        for (int i =1; i<a.length;i++){
            if (a[i]>biggest){
                secondBiggest=biggest;
                biggest=a[i];

            }

            else if (a[i]>secondBiggest && a[i]!=biggest ) {
                secondBiggest = a[i];

            }

        }
        System.out.println("The Biggest element in array is :  " +  biggest);
        System.out.println("The SecondBiggest element in array is :  " +  secondBiggest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int []b= new int[n];
        for (int i =0;i<n;i++){
            System.out.print("Enter the "+ (i+1)+" element : ");
            b[i]=sc.nextInt();
        }

        System.out.println("Entered array is ");
        for (int x:b){
            System.out.print(x+" ");
        }

        System.out.println("");
        getElement(b);
    }
}
