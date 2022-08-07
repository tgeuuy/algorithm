package acwing.AC_30;

/**
 * @Author tgeuuy
 * @Date 2021/11/24 9:32
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String s = "aa";
        String p = "ab*ac*a";
        boolean res = isMatch(s, p);
        System.out.println("res=" + res);
    }

    private static boolean isMatch(String s, String p) {
        int sindex = 0, pindex = 0;

        return matchCore(s, sindex, pindex, p);
    }

    private static boolean matchCore(String str, int sindex, int pindex, String pattern) {
        if (sindex >= str.length() && pindex == pattern.length()) {
            return true;
        }
        if (pindex >= pattern.length() && sindex < str.length()) {
            return false;
        }
        if (pindex + 1 < pattern.length() && pattern.charAt(pindex + 1) == '*') {
            if (sindex < str.length() && (str.charAt(sindex) == pattern.charAt(pindex) || pattern.charAt(pindex) == '.')) {
                return matchCore(str, sindex, pindex + 2, pattern) || matchCore(str, sindex + 1, pindex + 2, pattern) || matchCore(str, sindex + 1, pindex, pattern);

            } else {
                return matchCore(str, sindex, pindex + 2, pattern);
            }
        }
        if (sindex < str.length() && (str.charAt(sindex) == pattern.charAt(pindex) || pattern.charAt(pindex) == '.')) {
            return matchCore(str, sindex + 1, pindex + 1, pattern);
        }
        return false;
    }
}
