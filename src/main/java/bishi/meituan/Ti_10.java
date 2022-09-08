package bishi.meituan;

import java.util.*;

public class Ti_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            arr.add(t);

        }

        for (int v : arr) {
            int res = mex(v, arr);
            System.out.print(res + " ");
        }

    }

    private static int mex(int v, List<Integer> arr) {
        Set<Integer> set = new TreeSet<>();
        for (int val : arr) set.add(val);
        if (v == 0) return 0;
        else {
            set.remove(v);
            int res = 0;
            while (set.contains(res)) res++;
            return res;
        }

    }


}
