package bishi.meituan;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Ti_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();

        int[] time = new int[k + 1];
        for (int i = 1; i <= k; i++) time[i] = sc.nextInt();
        time[0] = t;
        int res = 0;
        int[] event = new int[n];
        for (int i = 0; i < n; i++)
            event[i] = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(t);
        for (int v : event) {
            if (v != 0) queue.offer(time[v]);
            else{
                if (queue.peek() == t) {
                    res += queue.peek();
                } else {
                    res += queue.poll();
                }

            }
        }
        System.out.println(res);


    }
}
