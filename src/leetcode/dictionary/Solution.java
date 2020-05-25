package leetcode.dictionary;

/**
 * @author admin
 * @date 2020/5/11 17:37
 */
public class Solution {

    public static void main(String[] args) {

    }

    public static int getSolutions(String article, String[] dictionary) {
        int count = 0;
        while (!article.isEmpty()) {
            for (String dict : dictionary) {
                if(article.startsWith(dict)) {
                    article = article.substring(dict.length());
                }
            }
        }
        return count;
    }
}
