package javaLearn.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-27  21:02
 * @Description: TODO
 * @Version: 1.0
 */
public class TestBigDecimal {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("0.7");
        BigDecimal b = new BigDecimal("0.6");

        System.out.println(a.subtract(b));  // a - b
//        System.out.println(a.divide(b));   // a / b  无法除尽报错
        System.out.println(a.divide(b, 2, RoundingMode.HALF_UP));// 1.11
        System.out.println(a.add(b));     // a + b
        System.out.println(a.multiply(b)); // a * b
    }

//    public enum RoundingMode {
//        // 2.5 -> 3 , 1.6 -> 2
//        // -1.6 -> -2 , -2.5 -> -3
//        UP(BigDecimal.ROUND_UP),
//        // 2.5 -> 2 , 1.6 -> 1
//        // -1.6 -> -1 , -2.5 -> -2
//        DOWN(BigDecimal.ROUND_DOWN),
//        // 2.5 -> 3 , 1.6 -> 2
//        // -1.6 -> -1 , -2.5 -> -2
//        CEILING(BigDecimal.ROUND_CEILING),
//        // 2.5 -> 2 , 1.6 -> 1
//        // -1.6 -> -2 , -2.5 -> -3
//        FLOOR(BigDecimal.ROUND_FLOOR),
//        // 2.5 -> 3 , 1.6 -> 2
//        // -1.6 -> -2 , -2.5 -> -3
//        HALF_UP(BigDecimal.ROUND_HALF_UP),
//        //......
//    }
}
