package Questions;
//https://leetcode.com/problems/reverse-string-ii/
public class Reverse_String_Two {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i += 2 * k) {
            int left = i;
            //Ensure don't get index out of bound
            int right = Math.min(i + k - 1, arr.length - 1);
            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
