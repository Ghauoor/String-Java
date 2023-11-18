package Questions;

import java.util.ArrayList;
// https://leetcode.com/problems/decode-string/description/

public class Decode_String {
    public String decodeString(String s) {
        ArrayList<String> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.add(s.substring(i, i + 1));
            } else {
                // extracting subtring
                StringBuilder subStr = new StringBuilder();
                while (stack.get(stack.size() - 1).charAt(0) != '[') {
                    subStr.insert(0, stack.remove(stack.size() - 1));
                }
                stack.remove(stack.size() - 1);
                // extracting number
                StringBuilder num = new StringBuilder();
                // for extracting number part
                while (stack.size() > 0 && (int) stack.get(stack.size() - 1).charAt(0) >= 48 && stack.get(stack.size() - 1).charAt(0) <= 57) {
                    num.insert(0, stack.remove(stack.size() - 1));
                }
                int n = Integer.parseInt(num.toString());

                for (int j = 0; j < n; j++) {
                    stack.add(subStr.toString());
                }
            }
        }
        return String.join("", stack);
    }
}
