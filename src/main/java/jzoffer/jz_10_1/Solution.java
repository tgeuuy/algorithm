package jzoffer.jz_10_1;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 斐波那契数列
 */
public class Solution {


    @Test
    public void test() {
        for (int v : Fibonacci(20)) {
            System.out.print(v + " ");
        }
        System.out.println();
    }


    public ArrayList<Integer> Fibonacci(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int a = 0, b = 0, c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            res.add(c);
        }
        return res;
    }

}
