package leetcode.leet_43;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        String a = "123";
        String b = "456";
        //122166
        String res = multiply(a, b);
        System.out.println("res = " + res);
        return;
    }


    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num1.equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        int l1 = num1.length(), l2 = num2.length();
        int[] C = new int[l1 + l2];
        int[] A = new int[l1];
        int[] B = new int[l2];
        for (int i = l1 - 1; i >= 0; i--) A[l1 - i - 1] = num1.charAt(i) - '0';
        for (int i = l2 - 1; i >= 0; i--) B[l2 - i - 1] = num2.charAt(i) - '0';
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                C[i + j] += A[i] * B[j];
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
        int c = 0;
        for (int i = 0; i <l1+l2; i++) {
            int t = C[i];
            C[i] = (c + t) % 10;
            c = (c + t) / 10;

        }
        System.out.println(Arrays.toString(C));
        int i = l1 + l2 - 1;
        while (i >= 0 && C[i] == 0) i--;
        for (int j = i; j >= 0; j--) sb.append(C[j]);
        return sb.toString();

    }
}
