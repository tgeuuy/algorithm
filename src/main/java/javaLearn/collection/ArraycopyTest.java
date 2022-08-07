package javaLearn.collection;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-28  16:18
 * @Description: TODO
 * @Version: 1.0
 */
public class ArraycopyTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = new int[10];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        /**
         *   复制数组
         * @param src 源数组
         * @param srcPos 源数组中的起始位置
         * @param dest 目标数组
         * @param destPos 目标数组中的起始位置
         * @param length 要复制的数组元素的数量
         */
        for (int v : a) System.out.print(v + " ");
        System.out.println();
        System.arraycopy(a, 2, a, 3, 3);
        for (int v : a) System.out.print(v + " ");
        System.out.println();
        a[2] = 99;
        for (int v : a) System.out.print(v + " ");
    }

}
