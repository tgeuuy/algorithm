package leetcode.leet_26;

import org.junit.Test;

public class Solutiom {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int res = 0;
        while (i < j && j < nums.length) {
            if (nums[i] == nums[j]) {
                i = j;

            } else {
                res++;
                j++;
            }

        }


        return res;


    }

@Test
    public void practice() {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }
}
