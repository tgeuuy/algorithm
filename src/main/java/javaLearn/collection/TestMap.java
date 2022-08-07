package javaLearn.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-30  10:37
 * @Description: TODO
 * @Version: 1.0
 */


public class TestMap {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("a","A");
//        map.put("b","B");
//        String v = map.put("b","v"); // 输出 B
//        System.out.println(v);
//        String v1 = map.put("c","v");
//        System.out.println(v1); // 输出：NULL


//        Map<String, String> map = new HashMap<>();
//        map.put("a", "A");
//        map.put("b", "B");
//         String val = map.compute("b", (k, v) -> "v"); // 输出 v
//        System.out.println(val);
//        String v1 = map.compute("c", (k, v) -> "v"); // 输出 v
//        System.out.println(v1);
//
//        for(String set: map.keySet()){
//            System.out.println(set+"  "+  map.get(set));
//        }



//        Map<String, String> map = new HashMap<>();
//        map.put("a","A");
//        map.put("b","B");
//        String v = map.putIfAbsent("b","v");  // 输出 B
//        System.out.println(v);
//        String v1 = map.putIfAbsent("c","v");  // 输出 null
//        System.out.println(v1);
//




        Map<String, String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");
        String v = map.computeIfAbsent("b",k->"v");  // 输出 B
        System.out.println(v);
        String v1 = map.computeIfAbsent("c",k->"v"); // 输出 v
        System.out.println(v1);

        for(String set: map.keySet()){
            System.out.println(set+"  "+  map.get(set));
        }

    }
}
