package acwing.AC_84;

/**
 * @Author tgeuuy
 * @Date 2021/12/22 17:41
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int res = getSum(n);
        System.out.println("res=" + res);

    }


    public static int getSum(int n) {
        int res = n;
        boolean flag = res > 0 && (res += getSum(n - 1)) > 0;
        return res;

    }
}
