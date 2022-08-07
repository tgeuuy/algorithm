package acwing.AC_77;

/**
 * @Author tgeuuy
 * @Date 2021/12/17 10:21
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        String s = "I am a student.";
        String res = reverseWords(s);
        System.out.println("res = " + res);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        char[] chars = s.toCharArray();

        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == ' ') {
                reverse(chars, index, i - 1);
                index = i + 1;
            }
            if (i == s.length() - 1) {
                reverse(chars, index, i);
            }
        }
        reverse(chars, 0, s.length() - 1);
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
