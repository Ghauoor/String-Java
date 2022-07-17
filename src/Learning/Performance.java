package Learning;

public class Performance {
    public static void main(String[] args) {
        //TC: O(NxN)
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);

            series += ch;
        }
        System.out.println(series);

    }
}
