package jzoffer.jz_38;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {
    public boolean[] st;
    public int len;
    public ArrayList<String> res;


    @Test
    public void test() {
        String str = "abcde";
        for (String s : permutation(str)) {
            System.out.println(s);
        }
        System.out.println(res.size());
    }

    public String[] permutation(String s) {
        this.len = s.length();
        this.st = new boolean[len];
        this.res = new ArrayList<>();
        char[] chs = s.toCharArray();
        int n = chs.length;
        int[] arr = new int[n];
        dfs(s, arr, 0, n);
        String[] ss = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ss[i]=res.get(i);
        }
        return ss;

    }

    private void dfs(String s, int[] arr, int p, int len) {
        if (p == len) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < len; i++) {
                sb.append(s.charAt(arr[i]));
//                System.out.print(arr[i] + " ");
            }
            res.add(sb.toString());
//            System.out.println();
            return;
        } else {
            for (int i = 0; i < len; i++) {
                if (!st[i]) {
                    arr[p] = i;
                    st[i] = true;
                    dfs(s, arr, p + 1, len);
                    st[i] = false;
                }

            }
        }


    }
}
