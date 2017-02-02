package algorithms.strings.super_reduced_string;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/reduced-string
 *
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner stdin = new Scanner(System.in)) {
            String input = stdin.nextLine();
            System.out.println(reduce(input));
        }
    }

    private static String reduce(String s) {
        if (s.isEmpty()) {
            return "Empty String";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() -1);
            } else {
                sb.append(c);
            }
        }
        return (sb.length() != 0) ? sb.toString() : "Empty String";
    }

}
