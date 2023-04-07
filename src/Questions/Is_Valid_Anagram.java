package Questions;
//https://leetcode.com/problems/valid-anagram/

/**
 * An Anagram is a word or phrase formed by rearranging
 * the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class Is_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int[] alphas = new int[26];

        for (char ch :
                s.toCharArray()) {
            alphas[ch - 'a']++;
        }

        for (char ch :
                t.toCharArray()) {
            alphas[ch - 'a']--;
        }

        for (int i :
                alphas) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
