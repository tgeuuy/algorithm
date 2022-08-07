package string.INleet_1576;

import org.junit.Test;

public class Solution {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                char tmp = 'a';
                while (i!=0&&tmp!=chars[i-1]){
                    chars[i]=tmp++;
                }
                while (i!=s.length()-1 && tmp!=chars[i-1]){
                    chars[i]=tmp++;
                }

            }
        }

        return new String(chars);
    }

    @Test
    public void practice() {
        String s = "ubv?w";
        String res = modifyString(s);
        System.out.println(res);
        System.out.println((char) (Math.random() * 26 + 'a'));
    }

}
