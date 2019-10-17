package src.leetcode.guessnumbers;

/**
 * @author admin
 * @date 2019/10/17 10:14
 */
public class Solution {

    public int game(int[] guess, int[] answer) {
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]) {
                correct++;
            }
        }
        return correct;
    }
}
