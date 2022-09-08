package bishi.meituan8_20;

import java.util.*;

public class T2 {


    static class Pari implements Comparable {
        public int a;
        public int b;

        public Pari(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pari pari = (Pari) o;
            return a == pari.a && b == pari.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }


        @Override
        public int compareTo(Object o) {
            Pari pari = (Pari) o;
            if (pari.a == this.a) return pari.b - this.b;
            else return pari.a - this.a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Pari> list1 = new ArrayList<>();
        List<Pari> list2 = new ArrayList<>();
        List<Pari> list3 = new ArrayList<>();
        List<Pari> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (Math.abs(x1 - i) + Math.abs(y1 - j) == a) list1.add(new Pari(i, j));
                if (Math.abs(x2 - i) + Math.abs(y2 - j) == b) list2.add(new Pari(i, j));
                if (Math.abs(x3 - i) + Math.abs(y3 - j) == c) list3.add(new Pari(i, j));
            }
        }
        for (Pari v : list1) {
            if (list2.contains(v)&& list3.contains(v)) res.add(v);
        }
        Collections.sort(res, new Comparator<Pari>() {
            @Override
            public int compare(Pari o1, Pari o2) {

                if (o1.a == o2.a) return o1.b - o2.b;
                else return o1.a - o2.a;
            }
        });
        int aa = res.get(0).a;
        int bb = res.get(0).b;
        System.out.println(aa + "  " + bb);

    }
}
