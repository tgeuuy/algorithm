package acwing.AC_803;

import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_803
 * @Author: tgeuuy
 * @CreateTime: 2022-07-05  22:51
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    static class Pair implements Comparable<Pair> {
        int start;
        int end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(start, o.start);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.add(new Pair(s, e));
        }
        Collections.sort(list);

        int start = list.get(0).start;
        int end = list.get(0).end;
        int res = 0;
        for (Pair p : list) {
            if (p.start <= end) end = Math.max(end, p.end);
            else {
                res++;
                start = p.start;
                end = p.end;
            }
        }

        System.out.println(res);

    }
}
