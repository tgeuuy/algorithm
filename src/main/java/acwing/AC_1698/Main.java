package acwing.AC_1698;

import java.util.*;

public class Main {
    public static final int MAX = 34;
    public static ArrayList<Integer> A = new ArrayList<>();
    public static ArrayList<Integer> B = new ArrayList<>();
    public static int[] w = new int[MAX];
    public static int n, m;


    private static void dfs(int u, int k, int s, List<Integer> way) {
        if (u == k) way.add(s);
        else {
            dfs(u + 1, k, s, way); //不选第u个数
            dfs(u + 1, k, (s + w[u]) % m, way); //选第u个数
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        dfs(0, n / 2, 0, A);
        System.out.println(A.toString());
        dfs(0, n / 2, 0, B);
        System.out.println(B.toString());

        Collections.sort(A);
        Collections.sort(B);

        int res = (A.get(A.size() - 1) + B.get(B.size() - 1)) % m;
        for (int i = 0, j = B.size() - 1; i < A.size(); i++) {
            while (j >= 0 && A.get(i) + B.get(i) > m) j--;
            if (j >= 0) res = Math.max(res, (A.get(i) + B.get(j)) % m);
        }
        System.out.println(res);

    }


}
