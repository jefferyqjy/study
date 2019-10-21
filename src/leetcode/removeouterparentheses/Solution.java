package leetcode.removeouterparentheses;

/**
 * @Desceiption
 *
 * @author admin
 * @date 2019/10/18 9:56
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(removeOuterParenthes("(()())(())"));
    }

    public static String removeOuterParenthes(String S) {
        if (S == null || S.isEmpty()) {
            return "";
        }

        char left = '(';

        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (currentChar == left) {
                if (flag != 0) {
                    sb.append(currentChar);
                }

                // 碰到左括号flag加一
                flag ++;
            } else {
                // 碰到有括号flag减一
                flag --;

                if (flag != 0) {
                    sb.append(currentChar);
                }
            }

        }

        return sb.toString();
    }
}
