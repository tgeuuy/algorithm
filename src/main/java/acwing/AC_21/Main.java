package acwing.AC_21;

/**
 * @Author tgeuuy
 * @Date 2021/11/18 9:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n = 20;
        int res = Fibonacci(n);
        System.out.println("res=" + res);
    }

    public static int Fibonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return a;

    }
}
