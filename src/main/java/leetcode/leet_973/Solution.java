package leetcode.leet_973;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] P1, int[] P2) {
                return (P1[0]*P1[0]+P1[1]*P1[1]) - (P2[1]*P2[1]+P2[0]*P2[0]);
            }
        });
        return Arrays.copyOfRange(points,0,K);
    }

    @Test
    public void practice() {
        int[][] points = {{1, 3}, {-2, 2}, {1, 1}};
        int k=2;
        int[][] res=kClosest(points,k);
        for (int i=0;i<res.length;i++){
            System.out.println("("+res[i][0]+","+res[i][1]+")");
        }

    }

}
