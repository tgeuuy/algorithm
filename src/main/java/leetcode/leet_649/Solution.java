package leetcode.leet_649;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public String predictPartyVictory(String senate) {
//        int n = senate.length(), cnt = 0;
//        boolean flag_r = true, flag_d = true;
//        while (flag_r && flag_d) {
//            flag_r = false;
//            flag_d = false;
//            for (int i = 0; i < n; i++) {
//                char ch = senate.charAt(i);
//                if (ch == 'R') {
//                    if (cnt < 0) {
//                        senate = senate.substring(0, i - 1) + '0' + senate.substring(i + 1);
////                        ch = 'O';
//                    }
//                    cnt++;
//                    flag_r = true;
//                } else if (ch == 'D') {
//                    if (cnt > 0) {
////                        ch = 'O';
//                        senate = senate.substring(0, i - 1) + '0' + senate.substring(i + 1);
//                    }
//                    cnt--;
//                    flag_d = true;
//                }
//            }
//        }
//        return flag_r ? "Radiant" : "Dire";
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll(), direIndex = dire.poll();
            if (radiantIndex < direIndex) {
                radiant.offer(radiantIndex + n);
            } else {
                dire.offer(direIndex + n);
            }
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }

    @Test
    public void practice() {
        String st = "RDD";
        String res = predictPartyVictory(st);
        System.out.println("res=" + res);
    }

}
