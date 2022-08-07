package leetcode.leet_168;

import org.junit.Test;

import java.util.HashMap;

public class Solution {


    @Test
    public void test() {
        System.out.println("res=" + convertToTitle(8542));
    }

    public String convertToTitle(int columnNumber) {
        if (columnNumber == 1) return new String("A");
        StringBuilder res = new StringBuilder();
        HashMap<Integer, Character> map = new HashMap();
        for (int i = 0; i < 26; i++) {
            map.put(i, (char) (65 + i));
        }
//        for (Map.Entry<Integer,Character> entry:map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }

        while (columnNumber > 0) {
            int tmp = (columnNumber - 1) % 26 + 1;
            res.append(map.get(tmp - 1));
            columnNumber = (columnNumber - tmp) / 26;

        }

        return res.reverse().toString();

    }
}
