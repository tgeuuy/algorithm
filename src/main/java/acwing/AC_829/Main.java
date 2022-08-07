package acwing.AC_829;

import java.util.Scanner;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_829
 * @Author: tgeuuy
 * @CreateTime: 2022-07-02  00:03
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    static class Myqueue {
        Stack<Integer> st1;
        Stack<Integer> st2;

        Myqueue() {
            this.st1 = new Stack<>();
            this.st2 = new Stack<>();
        }

        public void push(int x) {
            st1.push(x);
        }

        public void pop() {
            while (!st1.isEmpty()) st2.push(st1.pop());
            st2.pop();
            while (!st2.isEmpty()) st1.push(st2.pop());

        }

        public boolean empty() {
            return st1.isEmpty();
        }

        public int query() {
            while (!st1.isEmpty()) st2.push(st1.pop());
            int res = st2.peek();
            while (!st2.isEmpty()) st1.push(st2.pop());
            return res;
        }
    }

    public static void main(String[] args) {
       Myqueue stt = new Myqueue();
        Scanner sc = new Scanner(System.in);

        int m = Integer.valueOf(sc.nextLine());

        while (m-- > 0) {

            String[] str = sc.nextLine().split(" ");
            String op = str[0];
//            System.out.println(str[0]);
            if ("query".equals(op)) {
                System.out.println(stt.query());

            } else if ("pop".equals(op)) {
                stt.pop();
            } else if ("empty".equals(op)) {
                if (stt.empty() == true) System.out.println("YES");
                else System.out.println("NO");
            } else {

                stt.push(Integer.valueOf(str[1]));
            }
        }
    }
}
