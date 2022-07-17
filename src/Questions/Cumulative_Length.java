package Questions;

import java.util.Scanner;

public class Cumulative_Length {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arr = {};

        combinedLength(arr);

    }
    static void combinedLength(String[] arr ) {

        int totLength = 0;


        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.next();
            totLength += arr[i].length();

        }
        System.out.println("Total Length of String is "+totLength);
    }
}
