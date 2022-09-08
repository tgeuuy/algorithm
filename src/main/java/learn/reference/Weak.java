package learn.reference;

import java.lang.ref.WeakReference;

public class Weak {

    /**
     * 弱引用也是用来描述那些非必须对象，但是它的强度比软引用更弱一些，被弱引用关联的对象只
     * 能生存到下一次垃圾收集发生为止。当垃圾收集器开始工作，无论当前内存是否足够，都会回收掉
     * 只 被弱引用关联的对象。在JDK 1.2版之后提供了WeakReference类来实现弱引用。
     */
    public static void main(String[] args) {

        WeakReference<String> str = new WeakReference<String>("penguin");
        System.out.println(str.get());
        //通知JVM进行内存回收
        System.gc();

        System.out.println(str.get());

    }
}
