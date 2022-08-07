package test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String s = str.substring(j, i + 1);
                if (map.containsKey(s)) {;
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
        }
        int res = -1;
        for (String sss : map.keySet()) {
            res = Math.max(res, map.get(sss));
        }
        System.out.println(res);


    }

}
