package javaLearn.unSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-27  21:19
 * @Description: TODO
 * @Version: 1.0
 */
public class TestUnSafe {
    public static Logger log = LoggerFactory.getLogger(TestUnSafe.class);

    public static Unsafe unsafe ;

    private static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    private static void memoryTest() {
        int size = 4;
        long addr = unsafe.allocateMemory(size);
        long addr3 = unsafe.reallocateMemory(addr, size * 2);
        System.out.println("addr: "+addr);
        System.out.println("addr3: "+addr3);
        try {
            unsafe.setMemory(null,addr ,size,(byte)1);
            for (int i = 0; i < 2; i++) {
                unsafe.copyMemory(null,addr,null,addr3+size*i,4);
            }
            System.out.println(unsafe.getInt(addr));
            System.out.println(unsafe.getLong(addr3));
        }finally {
            unsafe.freeMemory(addr);
            unsafe.freeMemory(addr3);
        }
    }


    public static void main(String[] args) {
        unsafe = reflectGetUnsafe();
        memoryTest();

    }
}
