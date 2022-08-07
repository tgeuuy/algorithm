package acwing.AC_78;

/**
 * @Author tgeuuy
 * @Date 2021/12/17 11:26
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String str = "AAAAAfdgdfghshgfhfdhfDADSF";
        String res = leftRotateString(str, 5);
        System.out.println("res=" + res);

    }


    public static String leftRotateString(String str, int n) {
        char[] chars = str.toCharArray();
        reverse(chars, 0, n-1);
        reverse(chars, n , str.length() - 1);
        reverse(chars, 0, str.length() - 1);
        return new String(chars);


    }

    private static void reverse(char[] chars, int start, int end) {
        if (start > end) return;
        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
    }
}
