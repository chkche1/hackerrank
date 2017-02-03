package algorithms.dynamic_programming.the_coin_change_problem;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/coin-change
 *
 * S has to be a long array. Defining it as an int[] failed the following test case:
 *
 * Input:
 * 245 26
 * 16 30 9 17 40 13 42 5 25 49 7 23 1 44 4 11 33 12 27 2 38 24 28 32 14 50
 *
 * Output:
 * 64027917156
 *
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for (int coins_i = 0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }

        long[] S = new long[n+1];
        S[0] = 1;
        for (int i = 0; i < coins.length; i++){
            for (int j = 1; j <= n ; j++){
                if (j >= coins[i]){
                    S[j] += S[j-coins[i]];
                }
            }
        }

        System.out.println(S[n]);
    }
}
