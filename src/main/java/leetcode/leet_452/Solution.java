package leetcode.leet_452;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        List<int[]> list = Arrays.stream(points).sorted((s1, s2) -> {
            //��������ĵ�һ����start������������
            return s1[0] - s2[0];
        }).collect(Collectors.toList());
        //���ϵ�������
        int left = list.get(0)[0];
        //���ϵ�������
        int right = list.get(0)[1];
        //�����������
        int num = 0;
        for(int i = 1;i<list.size();i++){
            if(list.get(i)[0] <= right && list.get(i)[1] >= left){
                left = Math.max(left,list.get(i)[0]);
                right = Math.min(right, list.get(i)[1]);
            }else{
                num++;
                left = list.get(i)[0];
                right = list.get(i)[1];
            }
        }
        return num+1;


    }

    @Test
    public void practice() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int res = findMinArrowShots(points);
        System.out.println(res);
    }
}
