//WAJP to remove an element from an Array

package array_questions;
import java.util.Scanner;
public class Remove_Element {
    public static int[] removeElement(int []a,int index){
        int [] b = new int [a.length-1];
        for (int i=0; i<a.length;i++){
            if (i<index){
                b[i]=a[i];
            }
            else if (i>index){
                b[i-1]=a[i];
            }
        }
        return a ;
    }
}
