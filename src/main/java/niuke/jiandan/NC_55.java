package niuke.jiandan;


import java.util.Arrays;

public class NC_55 {


    public static void main(String[] args) {
        String[] strs = new String[]{"abca", "abc", "abca", "abc", "abcc"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }


    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null || strs.length == 0) return null;
        for (int i = 0; ; i++) {
            if (i >= strs[0].length()) return sb.toString();
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length() <= i || str.charAt(i) != c) {
                    return sb.toString();
                }
            }
//            System.out.print(strs[i] + " ");
            sb.append(c);
        }
    }
}
