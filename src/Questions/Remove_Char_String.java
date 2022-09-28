package Questions;

public class Remove_Char_String {
    public static void main(String[] args) {
        String str = "shls23Ajsd53";
        System.out.println(convert(str));
    }
    static String convert(String str) {
        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) < 48 || sb.charAt(i) > 57) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
