//WAJP to take a String input and count all the numeric characters in the String.
package string;
public class Count_Numeric_Characters {
    public static  int countNumericCharacter(String s){
        int count=0;
        for (int i =0; i<s.length();i++){
            char p = s.charAt(i);
            if (s.charAt(i)>=48 && p<=57){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "MO10H78A9N21";
        int a = countNumericCharacter(s);
        System.out.println("Total number of characters in string ( "+s+" ) +  is" + a );
    }
}
