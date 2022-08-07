package test;

import org.junit.Test;

public class Demo2 {
    public int age;

    public Demo2() {
        this.age = 44;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "age=" + age +
                '}';
    }

    @Test
    public void test() {
        Demo2 demo2 = new Demo2();
        demo2.age = 543;
        System.out.println(demo2.toString());
        String s = "dasda";
        System.out.println('a'+1);
        System.out.println(Character.toChars('a'+5));


    }
}
