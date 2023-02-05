package Questions;

public class Permutation_In_String {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abcdef";

        System.out.println(checkInclusion(str1, str2));
    }

    static private boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        //Edge case
        if (m > n) {
            return false;
        }
        //count for frequency
        int[] count = new int[26];

        //update the frequency
        for (int i = 0; i < m; i++) {
            count[s1.charAt(i) - 'a']++;
        }

        //Sliding window
        for (int i = 0; i < n; i++) {
            count[s2.charAt(i) - 'a']--;

            if (i - m >= 0)
                count[s2.charAt(i - m) - 'a']++;

            if (allZero(count))
                return true;
        }

        return false;
    }

    static private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
}
