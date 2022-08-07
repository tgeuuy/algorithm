package javaLearn.string;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-27  14:45
 * @Description: TODO
 * @Version: 1.0
 */
public class NewIntern {
    public static void main(String[] args) {


        // 在堆中创建字符串对象”Java“
        // 将字符串对象”Java“的引用保存在字符串常量池中
        String s1 = "Java";
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s2 = s1.intern();


        // 会在堆中在单独创建一个字符串对象
        String s3 = new String("Java");
        // 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s4 = s3.intern();


        // s1 和 s2 指向的是堆中的同一个对象
        System.out.println(s1 == s2); // true
        // s3 和 s4 指向的是堆中不同的对象
        System.out.println(s3 == s4); // false
        // s1 和 s4 指向的是堆中的同一个对象
        System.out.println(s1 == s4); //true


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
