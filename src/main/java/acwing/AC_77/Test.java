package acwing.AC_77;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "I am a student.";
        String res = reverseWords(s);
        System.out.println("res =" + res);

    }

    public static String reverseWords(String s) {
        if (s.length() == 0) return s;
        char[] chs = s.toCharArray();

        swap(chs, 0, chs.length - 1);
        System.out.println(Arrays.toString(chs));
        for (int i = 0; i < chs.length; i++) {
            int j = i;
            if (j == chs.length - 1) {
                swap(chs, i, j);
            }
            while (j < chs.length && chs[j] != ' ') j++;
            swap(chs, i, j - 1);
            i = j;
        }

        return new String(chs);

    }

    private static void swap(char[] chs, int l, int r) {
        while (l < r) {
            char c = chs[l];
            chs[l] = chs[r];
            chs[r] = c;
            l++;
            r--;
        }
    }
}
