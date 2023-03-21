package Questions;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class Reverse_Words_In_String_Three {
    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;

        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == ' ') {
                reverse(charArray, i, j - 1);
                i = j + 1;
            }
        }

        reverse(charArray, i, charArray.length - 1);

        return new String(charArray);
    }

    private void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}
