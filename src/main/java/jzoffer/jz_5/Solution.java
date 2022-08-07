package jzoffer.jz_5;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        System.out.println("res=" + replaceSpaces(new StringBuffer("We are happy.")));
    }

    public String replaceSpaces(StringBuffer str) {
        if (str.length() == 0 || str == null) return null;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            }
            res.append(str.charAt(i));
        }
        return res.toString().replaceAll(" ","");
    }
}
