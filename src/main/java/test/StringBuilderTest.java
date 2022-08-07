package test;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aba");
        String ss = String.valueOf(sb.reverse());
        System.out.println(sb );
        System.out.println(ss);
        System.out.println(sb.equals(ss));
    }
}
