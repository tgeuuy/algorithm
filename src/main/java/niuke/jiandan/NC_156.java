package niuke.jiandan;

import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Handler;

public class NC_156 {

    @Test
    public void practice() {
        int[] arr = new int[]{
                5, 5, 5, 1, 1, 1, 4
        };
        int k = 11;
        int res = foundOnceNumber(arr, k);
        System.out.println("res=" + res);
    }

    //    public int foundOnceNumber(int[] arr, int k) {
//        //爆内存
//        int res = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], k) - 1);
//        }
//        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, Integer> entry = it.next();
//            if (entry.getValue() != 0) {
//                res = entry.getKey();
//            }
//        }
//        return res;
//        // write code here
//    }
//    public int foundOnceNumber(int[] arr, int k) {
//        int res = 0;
//        HashMap<Integer, Boolean> map = new HashMap<>();
//        for (int v : arr) {
//            if (!map.containsKey(v)) {
//                map.put(v, false);
//            } else {
//                map.put(v, true);
//            }
//        }
//
//        for (int v : arr) {
//            if (!map.get(v)) {
//                return v;
//            }
//        }
//        return 0;
//    }

    public int foundOnceNumber(int[] arr, int k) {
        Arrays.sort(arr);
        int len = arr.length;
        if (arr[0] != arr[1] && arr[1] == arr[2]) return arr[0];
        if (arr[len - 1] != arr[len - 2]) return arr[len - 1];
        for (int i = 1; i < len - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                return arr[i];
        }
        return 0;

    }
}
