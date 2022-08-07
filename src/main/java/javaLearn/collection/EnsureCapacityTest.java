package javaLearn.collection;

import java.util.ArrayList;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-28  16:25
 * @Description: TODO
 * @Version: 1.0
 */
public class EnsureCapacityTest {
    //    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<Object>();
//        final int N = 10000000;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            list.add(i);
//        }
//        long endTime = System.currentTimeMillis();
//        //3580
//        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));
//
//    }
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        final int N = 10000000;
        list = new ArrayList<Object>();
        long startTime1 = System.currentTimeMillis();
        list.ensureCapacity(N);
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        // 1429
        System.out.println("使用ensureCapacity方法后：" + (endTime1 - startTime1));
    }
}
