package leetcode.leet_401;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    @Test
    public void test() {
        for (String s : readBinaryWatch(1)) {
            System.out.println(s);
        }

    }

    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    res.add(i + ":" + (j < 10 ? "0" + j : j));
                }
            }
        }
        return res;

    }
}
