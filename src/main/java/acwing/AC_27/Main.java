package acwing.AC_27;

/**
 * @Author tgeuuy
 * @Date 2021/11/22 10:58
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        double res = Power(10, -2);
        System.out.println("res=" + res);
    }

    public static double Power(double base, int exponent) {
        boolean check = exponent > 0;
        double res = 1;
        exponent = Math.abs(exponent);
//        System.out.println(exponent);
        while (exponent != 0) {
            if ((exponent & 1) != 0) {
                res *= base;
            }
            base *= base;
            exponent >>= 1;
        }
        if (check) return res;
        else return 1.0 / res;


    }
}
