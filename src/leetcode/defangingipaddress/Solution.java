package src.leetcode.defangingipaddress;

/**
 * @Description
 *
 * @author admin
 * @date 2019/10/17 11:34
 */
public class Solution {

    public String defangIPaddr(String address) {
        if (address == null || address.isEmpty()) {
            return "";
        }

        return  address.replace(".", "[.]");
    }
}
