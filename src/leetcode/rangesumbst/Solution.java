package leetcode.rangesumbst;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @date 2019/10/30 18:14
 */
public class Solution {

    public int rangeSumBST(TreeNode root, int left, int right) {
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (root.left != null || root.right != null) {
            if (root.val <= right && root.val >= left) {
                list.add(root.val);
            }

        }

        return result;
    }

}
