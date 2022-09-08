package learn.reference;

import java.lang.ref.SoftReference;

public class SoftRefence  {
    /**
     * 如果一个对象具有软引用，内存空间足够，垃圾回收器就不会回收它；
     *
     * 如果内存空间不足了，就会回收这些对象的内存。只要垃圾回收器没有回收它，该对象就可以被程序使用。
     *
     * 软引用可用来实现内存敏感的高速缓存,比如网页缓存、图片缓存等。使用软引用能防止内存泄露，增强程序的健壮性。
     * SoftReference的特点是它的一个实例保存对一个Java对象的软引用， 该软引用的存在不妨碍垃圾收集线程对该Java对象的回收。
     */

    public static void main(String[] args) {

        SoftReference<String> pen = new SoftReference<String>("penguin");
        System.out.println(pen.get());
        //通知JVM进行内存回收
        System.gc();
        System.out.println(pen.get());
    }
}
