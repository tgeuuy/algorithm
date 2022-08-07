package acwing.AC_16;

/**
 * @Author tgeuuy
 * @Date 2021/11/15 9:47
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We are happy.");
        String res = replaceSpaces(str);
        System.out.println(res);
    }

    public static String replaceSpaces(StringBuffer str) {
        if (str.length() == 0) return "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') sb.append("%20");
            else sb.append(str.charAt(i));
        }
        return sb.toString();

    }
}
