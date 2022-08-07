package acwing.AC_830;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-09  23:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int v : arr) {

                while (!st.isEmpty() && st.peek() > v) st.pop();

                if (st.isEmpty()) {
                    System.out.print(-1 + " ");

                } else {
                    System.out.print(st.peek() + " ");
                }
                st.push(v);


        }
    }
}
