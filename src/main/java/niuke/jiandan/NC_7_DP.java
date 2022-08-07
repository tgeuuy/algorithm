package niuke.jiandan;

import org.junit.Test;

public class NC_7_DP {


    @Test
    public void practice() {
        int[] prices = new int[]{1, 4, 2};
        int res = maxProfit(prices);
        System.out.println("res=" + res);
    }

//    public int maxProfit(int[] prices) {
//        int res = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = 0; j < i; j++) {
//                res = Math.max(res, prices[i] - prices[j]);
//            }
//        }
//        return res;
//        // write code here
//    }

//    public int maxProfit(int[] prices) {
//        int res = 0;
//        int len = prices.length;
//        int[][] dp = new int[len][len];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                dp[i][j] = 0;
//            }
//        }
//        for (int i = 0; i < len; i++) {
//
//        }
//        return res;         // write code here     }
//
//    }


//    public int maxProfit(int[] prices) {
//
//        int res = 0;
//        int minprice = Integer.MAX_VALUE;
//        for (int i = 0; i < prices.length; i++) {
//            if (minprice > prices[i]) {
//                minprice = prices[i];
//            } else if (res < prices[i] - minprice) {
//                res = prices[i] - minprice;
//            }
//
//        }
//        return res;
//        // write code here
//    }

    public int maxProfit(int[] prices) {
        int res = 0;
        int minprice = Integer.MAX_VALUE;
        for (int v :
                prices) {
            minprice = Math.min(v, minprice);
            res = Math.max(res, v - minprice);
        }
        return res;
    }


}
