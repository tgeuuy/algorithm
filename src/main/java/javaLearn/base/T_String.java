package javaLearn.base;

public class T_String {
    public static void main(String[] args) {

        System.out.println("***********************************");

        String str1 = new String("ABC");

        System.out.println("第一个字符串:" + str1);


        char[] charArray = {'A', 'B', 'C'};

        String str2 = new String(charArray);

        System.out.println("第二个字符串:" + str2);

        byte[] byteArray = {97 - 32, 98 - 32, 99 - 32};

        String str3 = new String(byteArray);

        System.out.println("第三个字符串:" + str3);

        String str4 = "ABC";

        System.out.println("第四个字符串:" + str4);
        System.out.println("***********************************");

        String c1 = new String("a") + new String("b");
        System.out.println(c1.getClass());
        String c2 = "a" + "b";
        System.out.println(c1.getClass() == c2.getClass());

        String c3 = c2.intern();
        System.out.println(c3 == c2);

        String ss = "aaa";
        String bb = new String("aaa");
        System.out.println(ss == bb);
    }
}
