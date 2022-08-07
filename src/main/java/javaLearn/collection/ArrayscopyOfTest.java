package javaLearn.collection;

import java.util.Arrays;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-28  16:23
 * @Description: TODO
 * @Version: 1.0
 */
public class ArrayscopyOfTest {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;

//        public static int[] copyOf(int[] original, int newLength) {
//            int[] copy = new int[newLength];
//            System.arraycopy(original, 0, copy, 0,
//                    Math.min(original.length, newLength));
//            return copy;
//        }
        int[] b = Arrays.copyOf(a, 10);
        System.out.println("b.length" + b.length);
        for (int v : a) System.out.print(v + " ");
        System.out.println();
        for (int v : b) System.out.print(v + " ");
        System.out.println();
    }
}
