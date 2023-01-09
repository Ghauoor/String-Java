package Questions;

public class Sum_Of_Digit_After_String_To_Int {
    public int getLucky(String s, int k) {
        int num = 0;

        for (char c : s.toCharArray()) {
            int val = c - 96;
            if (val >= 10)
                val = (val % 10) + (val / 10) % 10;
            num += val;
        }

        while (k > 1) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            k--;
        }
        return num;
    }
}
