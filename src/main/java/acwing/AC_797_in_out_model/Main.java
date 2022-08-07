package acwing.AC_797_in_out_model;


import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N = 100010;  // 数据规模为 10w
    static int[] b = new int[N];    // b数组为 arr数组的差分
    static int[] arr = new int[N];  // arr数组为 b数组的前缀和

    // 对差分数组进行插入操作
    private static void insert(int l, int r, int val) {
        // 可以画图进行理解
        b[l] += val;
        b[r + 1] -= val;
    }

    // 程序入口
    public static void main(String[] args) throws IOException {
        // 初始化输入数据
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        String[] sArr = reader.readLine().split(" ");
        for (int i = 1; i <= n; i++)       // 注意下标为 1
            arr[i] = Integer.parseInt(sArr[i - 1]);

        // 初始化 b数组
        for (int i = 1; i <= n; i++) {
            // 相当于将 arr中全部看为 0, 则 b[n]中也全部都为 0, 再在其中区间 [i, i] 添加 arr[i], 求出 b[i]
            insert(i, i, arr[i]);
        }

        // m次循环操作
        while (m-- > 0) {
            String[] sIn = reader.readLine().split(" ");
            int l = Integer.parseInt(sIn[0]), r = Integer.parseInt(sIn[1]), val = Integer.parseInt(sIn[2]);
            insert(l, r, val);
        }

        // 求数组 arr插入元素后的值, 相当于求 b[n]的前缀和
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + b[i];
            log.write(arr[i] + " ");
        }

        // 释放资源
        reader.close();
        log.flush();
        log.close();
    }
}