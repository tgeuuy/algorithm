package bishi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Tencent_2 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 4, 5, 6};
        int res = getNumber(arr);
        System.out.println("res = " + res);
//        System.out.println(check(4));

    }


    public static int getNumber(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int v : a) list.add(v);
        while (list.size() > 1) {
//            System.out.println("list.size()=" + list.size());
            Set<Integer> set = check(list.size());
//            System.out.println(set);
            List<Integer> ll = new ArrayList<>();
            for (int i = 1; i <= list.size(); i++) {
                if (set.contains(i)) {
                    ll.add(list.get(i - 1));
                }
            }
            list = new ArrayList<>(ll);


//            System.out.println(list);
        }
        return list.get(0);

        // write code here
    }

    public static Set<Integer> check(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            boolean st = false;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
//                    System.out.println(j + "ddd");
                    st = true;
                    break;
                }
            }
//            System.out.println(i);
            if (!st) set.add(i);
        }
        return set;

    }

    public static int ch(boolean[] st) {
        int res = 0;
        for (boolean b : st) {
            if (b == false) res++;
        }
        return res;
    }
}
