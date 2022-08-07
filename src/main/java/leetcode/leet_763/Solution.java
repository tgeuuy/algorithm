package leetcode.leet_763;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> res = new ArrayList<>();
        int slow, len;
        slow = 0;
        for (int fast = 0; fast < S.length(); fast++) {
            len = fast - slow + 1;
            for (int start = slow + 1; start < fast; start++) {
                if (S.substring(slow, fast).indexOf(S.charAt(fast)) == -1) {
                    len++;
                } else {
                    res.add(len);
                    slow = fast;
                }
            }
            //  System.out.println("fast=" + fast);
            //  System.out.println("slow=" + slow);
        }
        return res;
    }

    @Test
    public void practice() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> res = partitionLabels(s);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }


    }
}
