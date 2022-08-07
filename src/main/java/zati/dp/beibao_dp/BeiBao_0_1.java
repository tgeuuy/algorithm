package zati.dp.beibao_dp;


import java.util.Scanner;

/**
 * 有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。
 * <p>
 * 第 i 件物品的体积是 vi，价值是 wi。
 * <p>
 * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
 * 输出最大价值。
 * <p>
 * 输入格式
 * 第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。
 * <p>
 * 接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。
 * <p>
 * 输出格式
 * 输出一个整数，表示最大价值。
 * <p>
 * 数据范围
 * 0<N,V≤1000
 * 0<vi,wi≤1000
 * 输入样例
 * 4 5
 * 1 2
 * 2 4
 * 3 4
 * 4 5
 * 输出样例：
 * 8
 */
public class BeiBao_0_1 {
    /**
     * 方法一：
     * 二维数组 dp[i][j]:  dp[i][v]表示前i件物品恰放入一个容量为v的背包可以获得的最大价值
     *
     * @param arg
     */


//    static int[][] dp = new int[1005][1005];
//
//    static int[] weight = new int[1005];
//
//    static int[] value = new int[1005];
//
//    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int v = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            weight[i] = sc.nextInt();
//            value[i] = sc.nextInt();
//        }
//        int[][] dp = new int[n + 1][v + 1];
//        for (int i = 1; i <= n; i++) {  //判断每个物品能否放进
//            for (int j = 0; j <= v; j++) {   //  对每个物品的状态进行判断
//                if (j >= weight[i]) {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        System.out.println(dp[n][v]);
//
//    }

    /**
     * 方法二：一维数组 dp[i] : 价值为 i时 的最大价值
     */
    static int[] dp = new int[1005];

    static int[] weight = new int[1005];

    static int[] value = new int[1005];

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {  //对每个物品 进行判断。
            for (int j = v; j >= weight[i]; j--) { //这个循环不能反，反了就是完全背包
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);////其实不断在判断最优解，一层一层的
            }
        }
        System.out.println(dp[v]);


    }


}
