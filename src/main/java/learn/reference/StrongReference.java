package learn.reference;

public class StrongReference {

    /**
     * 强引用有引用变量指向时永远不会被垃圾回收，JVM宁愿抛出OutOfMemory错误也不会回收这种对象。
     */

    public static void main(String[] args) {
        Object object = new Object();
        Object[] objects = new Object[1000];
    }
}
