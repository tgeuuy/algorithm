package niuke.jiandan;

import org.junit.Test;

public class NC_32 {

    @Test
    public void practice() {
        int x = 1518991037;
        int res = sqrt(x);
        System.out.println("res=" + res);
//        System.out.println(1.0e-6);
    }

//    public int sqrt(int x) {
//        // write code here
//        if (x <= 1) return x;
//        float l = 1, r = x * 1.0f;
//        float mid = 0;
//        while (r - l >= 1.0e-1) {
//            mid = l + (r - l) / 2.0f;
//            if (mid * mid > x) r = mid;
//            else l = mid;
//            System.out.println(l + "   " + r);
//        }
//        return (int) mid;

    public int sqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
