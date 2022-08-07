package acwing.AC_87;

/**
 * @Author tgeuuy
 * @Date 2021/12/23 20:05
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        String str = "+";
        int res = strToInt(str);
        System.out.println("res=" + res);

    }


    public static int strToInt(String str) {

        String str1 = str.trim();
        if (str1.length() == 0) return 0;
        long res = 0L;
        int t = 1;
        int r = str1.length() - 1;
        System.out.println(r);
        while (str1.charAt(r) <= '0' || str1.charAt(r) >= '9') {
            r--;
            if(r<=0) return 0;
        }

        int l = 0;
        if (str1.charAt(l) == '-') {
            t = -1;
            l++;
        }
        if (str1.charAt(l) == '+') {
            l++;
        }
        if (l == r) return 0;
        for (int i = l; i <= r; i++) {

            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                res = res * 10 + str1.charAt(i) - '0';
            } else {
                res = 0L;
                break;
            }
        }
        if (res * t > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (res * t < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) res * t * 1;


    }
}
