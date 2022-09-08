package bishi.guanglianda;

import java.util.*;

public class Ti_2 {

    static class Pair {
        int left;
        int right;
        int count;

        public Pair(int l, int r, int c) {
            this.left = l;
            this.right = r;
            this.count = c;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
//        int[] left = new int[n + 1];
//        int[] right = new int[n + 1];
//        int[] count = new int[n + 1];
        List<Pair> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Pair p = new Pair(a, b, c);
            list.add(p);
        }
        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.left - o2.left;
            }
        });
        list.forEach(pair -> System.out.println(pair.left + " " + pair.right + " " + pair.count));
        int res = 0;
        int l = list.get(0).left;
        int c = list.get(0).count;
        int r = list.get(0).right;


        for (int i = 1; i < list.size(); i++) {
            Pair p = list.get(i);
            if (p.left <= r) {
                res += p.count;
                r = Math.max(r, p.right);
            } else {
                res = Math.min(r - l + 1, res);
                res += p.left - r + 1;
                if (p.left == p.right) res += 1;
                l = p.left;
                r = p.right;

            }


        }
        System.out.println(res);

    }
}
