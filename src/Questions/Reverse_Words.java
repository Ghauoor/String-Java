package Questions;

import java.util.Arrays;

public class Reverse_Words {
    public static void main(String[] args) {

        String str = "My Name is Ghayoor";
        String str1 = "";
        String[] revStr = str.split(" ");

        for (int i = revStr.length-1; i >= 0; i--) {
           // System.out.println(revStr[i] + " ");
            str1 = str1 + revStr[i] + " ";
        }
        System.out.println(str1);
    }

}
