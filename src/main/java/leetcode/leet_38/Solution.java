package leetcode.leet_38;

public class Solution {

    public static void main(String[] args) {
        int n = 5;
        String res = countAndSay(n);
        System.out.println("res=" + res);
    }


    public static String countAndSay(int n) {
        if (n == 1) return "1";
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder("1");
        for (int i = 1; i <= n; i++) {
            res = tmp;
            for (int j = 0; j < res.length(); i++) {
                tmp = new StringBuilder();
                char t = res.charAt(j);
                int c = 0;
                while (j < res.length() && res.charAt(j) == t) {
                    j++;
                    c++;
                }
//                System.out.println(c + " " + t);
                tmp.append(c);
                tmp.append(t);
                System.out.println(res + "\n");
            }
            System.out.println("ddd");
        }
        return res.toString();

    }
}
