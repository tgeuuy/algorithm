package leetcode.leet_406;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] person1, int[] person2) {
                if (person1[0] != person2[0]) {
                    return person1[0] - person2[0];
                } else {
                    return person2[1] - person1[1];
                }
            }
        });
        int n = people.length;
        int[][] ans = new int[n][];
        for (int[] person : people) {
            int spaces = person[1] + 1;
            for (int i = 0; i < n; ++i) {
                if (ans[i] == null) {
                    --spaces;
                    if (spaces == 0) {
                        ans[i] = person;
                        break;
                    }
                }
            }
        }
        return ans;

    }

    @Test
    public void practice() {
        int people[][] = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int res[][] = reconstructQueue(people);
        for (int i = 0; i < res.length; i++) {
            System.out.print("[" + res[i][0] + "," + res[i][1] + "]");
        }
    }
}
