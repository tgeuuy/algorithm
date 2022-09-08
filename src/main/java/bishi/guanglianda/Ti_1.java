package bishi.guanglianda;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ti_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new ArrayDeque<>();
        int t = n;
        while (t-- > 0) {
            int a = sc.nextInt();
            q.offer(a);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int res = 0;
        for(int v: arr){
            if(!q.isEmpty()){
                if(q.peek()!= v) {
                    res++;
                    q.remove(v);
                }else {
                    q.poll();
                }
            }

        }
        System.out.println(res);
    }
}
