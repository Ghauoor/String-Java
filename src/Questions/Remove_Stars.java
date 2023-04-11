package Questions;

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
}
