package acwing.AC_82;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tgeuuy
 * @Date 2021/12/17 15:18
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int res = lastRemaining(5, 3);
        System.out.println("res = " + res);

    }

    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;

        while (list.size() > 1) {
            for (int i = 1; i < m; i++) {
                index = (index + 1) % list.size();
            }
            list.remove(index);
        }
        return list.get(0);
    }

}
