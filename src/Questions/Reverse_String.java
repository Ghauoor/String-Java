package Questions;

import java.awt.*;

public class Reverse_String {
    public static void main(String[] args) {

        String input = "Naruto";

        char[] ch = input.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }

    }
}
