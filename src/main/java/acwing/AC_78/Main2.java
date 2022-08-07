package acwing.AC_78;

public class Main2 {
    public static void main(String[] args) {
        String str = "1qweqe23421qwefq";
        String res = leftRotateString(str, 4);
        System.out.println("res=" + res);

    }

    public static String leftRotateString(String str, int n) {
        char[] chs = str.toCharArray();
        reverse(chs, 0, n - 1);
        reverse(chs, n, chs.length - 1);
        reverse(chs, 0, str.length() - 1);
        return new String(chs);


    }

    public static void reverse(char[] chs, int left, int right) {
        if (left >= right) return;
        while (left < right) {
            char ch = chs[left];
            chs[left] = chs[right];
            chs[right] = ch;
            left++;
            right--;
        }

    }
}
