package array;

import java.util.Scanner;

public class DeleteElementFromArray {

    public void deleteElement(int a[], int element){
        int n = a.length;
        int count=0;

        for (int i =0;i<n;i++){
            if (a[i]==element){
                count++;
                for (int j = i; j<n-1;j++){
                    a[j]=a[j+1];

                }
                break;
            }
        }

        if (count==0){
            System.out.println("Entered element not found in the array");
        }
        else {
            System.out.println("Array after deleting :" + element);
            for (int x : a) {
                System.out.print(x + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start");

        int[] arr ={10,50,40,44,77,80};

        System.out.print("Enter element to delete : ");
        int element = sc.nextInt();

        DeleteElementFromArray e1 = new DeleteElementFromArray();
        e1.deleteElement(arr,element);







    }
}