package learn.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Phantom {

    /**
     *
     弱引用应该还可以通过引用来获取对象，但是虚引用根本获取不到对象


     虚引用存在于每一个对象里面，不会对对象的存活造成任何影响，唯一用处就是：能在对象被GC时收到系统通知

     若某个对象与虚引用关联，那么在任何时候都可能被JVM回收掉。虚引用不能单独使用，必须配合引用队列一起使用。
     */
    public static void main(String args[]) {

        ReferenceQueue<String> queue = new ReferenceQueue<String>();
        PhantomReference<String> str = new PhantomReference<String>("abc", queue);
        System.out.println(str.get());
    }
}
