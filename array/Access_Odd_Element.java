package array;

public class Access_Odd_Element {
    public static void main(String[] args) {
        int[] a = {21,4,43,22,90,43};

//********************************USING FOR LOOP************************************************************************
        for (int i=0;i<a.length;i++){
            if (i%2==1){
                System.out.println(a[i]);
            }
        }
//********************************USING FOR EACH LOOP*******************************************************************
        int count=0;
        for (int x:a){
            if (count%2!=0){
                System.out.println(x);
            }
        count++;
        }
    }
}
