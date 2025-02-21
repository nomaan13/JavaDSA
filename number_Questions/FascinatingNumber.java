package number_Questions;

import java.util.Scanner;

public class FascinatingNumber {
    public static boolean isFascinatingNumber(int n ) {
        int n2=n*2;
        int n3=n*3;
        String s  = n+""+n2+n3;


        int count;

        for (char c ='1';c<='9';c++){
            count = 0;
            for (int i =0;i<s.length();i++){
                if (c==s.charAt(i)){
                    count++;

                }

            }
            if (count==0||count>1){
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a three digit number: ");
        int a = sc.nextInt();

        int num=a;
        int count=0;
        while(a>0){
            count++;
            a/=10;

        }


        if (count==3){

             if (isFascinatingNumber(num)){
                 System.out.println(num+" is a fascinating number");
             }
             else System.out.println(num+" is a Not fascinating number");

        }
        else {
            System.out.println("Please enter a 3 digit number ");
        }


    }
}

