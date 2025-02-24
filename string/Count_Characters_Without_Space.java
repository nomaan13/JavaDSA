/*WAJP to take a String input and count all the characters without spaces in the String.*/
package string;
public class Count_Characters_Without_Space {
    public static int countCharactersWithoutSpace(String s ){
        int count=0;
        for (int i =0;i<s.length();i++){
            char p = s.charAt(i);
            if (p!=' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Good Morning EveryOne ";

        int a = countCharactersWithoutSpace(s);
        System.out.println("Total characters without space are: "+ a);
    }
}
