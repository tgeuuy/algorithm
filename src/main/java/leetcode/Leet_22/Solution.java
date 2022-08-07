package leetcode.Leet_22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//import static cn.acwing.AC_92.Main.dfs;

public class Solution {

    static StringBuilder sb = new StringBuilder();
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {


        int n = 6;
        List<String> res = generateParenthesis3(n);
        System.out.println("res=" + res);


    }


    public static List<String> generateParenthesis(int n) {
        if (n == 0) return null;

        dfs1(0, new char[n * 2]);
        return res;
    }

    private static void dfs1(int p, char[] path) {
        if (path.length == p) {
            if (vavil(path)) {
                res.add(new String(path));
                return;
            }
        } else {
            path[p] = '(';
            dfs1(p + 1, path);
            path[p] = ')';
            dfs1(p + 1, path);
        }
    }

    private static boolean vavil(char[] path) {
        int a = 0;
        for (int i = 0; i < path.length; i++) {
            if (path[i] == '(') a++;
            else a--;
            if (a < 0) return false;
        }
        return a == 0;
    }


    public static List<String> generateParenthesis1(int n) {
        dfs2(new StringBuilder(), 0, 0, n);
        return res;
    }

    private static void dfs2(StringBuilder path, int open, int close, int n) {
        if (path.length() == 2 * n) {
            res.add(new String(path));
            return;
        }
        if (open < n) {
            path.append('(');
            dfs2(path, open + 1, close, n);
            path.deleteCharAt(path.length() - 1);
        }
        if (close < open) {
            path.append(')');
            dfs2(path, open, close + 1, n);
            path.deleteCharAt(path.length() - 1);
        }
    }


    public static List<String> generateParenthesis3(int n) {
        return generate(n);

    }

    static ArrayList[] cache = new ArrayList[100];

    private static List<String> generate(int n) {
        if (cache[n] != null) {
            return cache[n];
        }
        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) ans.add("");
        else {
            for (int c = 0; c < n; c++) {
                for (String left : generate(c)) {
                    for (String right : generate(n - 1 - c)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        cache[n] = ans;
        return ans;

    }
}
