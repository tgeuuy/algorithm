package leetcode.leet_925;

import org.junit.Test;

public class Solution {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }else  {
                return false;
            }
        }
        return i == name.length();

    }

    @Test
    public void practice() {
        String name = "alex";
        String typed = "aaleex";
        boolean res = isLongPressedName(name, typed);
        System.out.println("res=" + res);
        return;
    }
}
