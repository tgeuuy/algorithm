package zati.test;

import java.util.Random;

public class t6 {
    public static void main(String[] args) {
        Random ran = new Random();

        int x = 25;
        while (x > 24) {
            x = ((ran.nextInt(5) + 1) * 5) - ran.nextInt(5) + 1;
            System.out.println(x % 3 + 1);
        }


    }
}
