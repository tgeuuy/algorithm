package acwing.AC_26;

/**
 * @Author tgeuuy
 * @Date 2021/11/22 9:54
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int res = NumberOf1(15);
        System.out.println("res=" + res);
    }

    public static int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            System.out.println(n & -n);
            n -= n & -n;
//            System.out.println(n);
            res++;
        }
        return res;
    }


}
