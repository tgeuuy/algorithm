package acwing.AC_53;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author tgeuuy
 * @Date 2021/12/9 10:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> res = getLeastNumbers_Solution(input, 6);
        for (int v : res) {
            System.out.print(v + " ");
        }

    }


    public static List<Integer> getLeastNumbers_Solution(int[] input, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int v : input) queue.offer(v);
        List<Integer> res = new ArrayList<>();
        while (k-- > 0) {
            res.add(queue.poll());
        }
        return res;

    }
}
