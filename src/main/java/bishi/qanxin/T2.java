package bishi.qanxin;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] ss = str.substring(1, str.length() - 1).split(",");
        int[] arr = new int[ss.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                ArrayList list = new ArrayList();
                list.add(i);
                map.put(arr[i], list);

            }
                for (Integer key :
                        map.keySet()) {
                    if (arr[i] > key) {
                        map.get(key).add(i);
                    }
                map.get(arr[i]).add(i);
            }
        }
        int res = 0;
        System.out.println(map);
        for (Integer key : map.keySet()) {

            Integer max = Collections.max(map.get(key));
            Integer min = Collections.min(map.get(key));
            res = Math.max(res, (max - min) * key);
        }
        System.out.println(res);


    }
}
