package Questions;

public class Reverse_String_And_Its_Words {
    public static void main(String[] args) {
        String originalString = "My Name i Ghayoor Hussain";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Swap the characters at opposite ends of the array
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        // Convert the array back to a string
        String reversedString = new String(charArray);

        // Return the reversed string
        return reversedString;
    }
}
