package Questions;
//https://leetcode.com/problems/removing-stars-from-a-string/description/
public class Remove_Stars {
    public String removeStars(String s) {
        StringBuffer res = new StringBuffer();

        for (char ch :
                s.toCharArray()) {
            if (ch == '*')
                res.setLength(res.length() - 1);
            else
                res.append(ch);
        }

        return res.toString();
    }

    public String removeStr(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }
}
