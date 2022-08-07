package acwing.AC_802;

import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_802
 * @Author: tgeuuy
 * @CreateTime: 2022-07-04  16:53
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    //    public static final int MAXSIZE = 2000000008;
//    public static int[] arr = new int[MAXSIZE];
    public static int N = 300010;
    public static List<Integer> alls = new ArrayList<>();
    public static List<CII> query = new ArrayList<>();
    public static List<CII> adds = new ArrayList<>();
    public static int a[] = new int[N];
    public static int[] s = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int c = sc.nextInt();
            alls.add(x);
            adds.add(new CII(x, c));
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            alls.add(l);
            alls.add(r);
            query.add(new CII(l, r));
        }

        //java 的离散操作
        alls = new ArrayList<>(new HashSet<>(alls));
        Collections.sort(alls);

        for (int i = 0; i < n; i++) {
            int x = find(adds.get(i).x1);
            a[x] += adds.get(i).x2;
        }

        for (int i = 1; i < N; i++) {
            s[i] = s[i - 1] + a[i];
        }
        for (int i = 0; i < m; i++) {
            int l = find(query.get(i).x1);
            int r = find(query.get(i).x2);
            System.out.println(s[r] - s[l - 1]);
        }


    }


    public static int find(int x) {
        int l = 0, r = alls.size() - 1;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (alls.get(mid) <= x)  l = mid;
             else r = mid - 1;
        }
        return l + 1;
    }

    static public class CII {
        int x1;
        int x2;

        public CII(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

    }
}
