package leetcode.leet_767;

import org.junit.Test;


public class Soiution767 {

    public void quick_sort(char[] S, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int mid = (l + r) >> 1;
        while (i <= j) {
            do i++; while (S[i] < S[mid]);
            do j--; while (S[j] > S[mid]);
            if (i <= j) {
                char tmp = S[i];
                S[i] = S[j];
                S[j] = tmp;
            }
        }
        quick_sort(S, l, mid);
        quick_sort(S, mid + 1, r);
    }

    public String reorganizeString(String S) {
        char[] chs = S.toCharArray();
        char[] res = new char[S.length()];

        quick_sort(chs, 0, chs.length - 1);
        res[0] = chs[0];
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
//        }
        int len = chs.length;
        int i = 0;
        int j = 1;
        while (i < len && j < len) {
            System.out.println("chs[" + i + "]" + "=" + chs[i]);
//            System.out.println("res[" + j + "]" + "=" + res[j]);
            if (chs[i] != res[j - 1]) {
                System.out.println("res[" + j + "]" + "=" + chs[i]);
                res[j++] = chs[i++];
            } else i++;
            if (i == len - 1) i = 1;
        }
        return new String(res);
    }

    @Test
    public void practice() {
        String s = "aab";
        System.out.println(s.length());
        String res = reorganizeString(s);
        System.out.println(res.length());
        System.out.println(res);
    }
}
