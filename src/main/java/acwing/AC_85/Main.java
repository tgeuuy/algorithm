package acwing.AC_85;

/**
 * @Author tgeuuy
 * @Date 2021/12/22 20:51
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        int a = 556432;
        int b = 60456;
        int res = add(a, b);
        System.out.println("res=" + res);
    }


    public static int add(int num1, int num2) {

        while (num2 != 0) {
            int sum = num1 ^ num2;
            int c = (num1 & num2) << 1;
            num1 = sum;
            num2 = c;
        }
        return num1;

    }


}
