package leetcode.leet_1109;

import org.junit.Test;

public class Solution {


    @Test
    public void practice() {

        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        int[] res = corpFlightBookings(bookings, n);
        for (int v : res) System.out.print(v + " ");
        System.out.println();

    }


//    public int[] corpFlightBookings(int[][] bookings, int n) {
//
//
//        int[] res = new int[n];
//
//        for (int i = 0; i < bookings.length; i++) {
//            int start = bookings[i][0] - 1;
//            int end = bookings[i][1] ;
//            for (int j = start; j < end; j++) {
//                res[j] += bookings[i][2];
//            }
//        }
//        return res;
//
//    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                nums[booking[1]] -= booking[2];
            }
        }
        for (int v : nums) System.out.print(v + " ");
        System.out.println();
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


}
