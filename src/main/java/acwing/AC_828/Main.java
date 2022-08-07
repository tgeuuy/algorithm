package acwing.AC_828;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_828
 * @Author: tgeuuy
 * @CreateTime: 2022-07-01  23:37
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    static class MyStack {
        int top;
        int[] st;


        MyStack() {
            this.top = -1;
            this.st = new int[100005];
        }

        public void push(int v) {
            top++;
            st[top] = v;
        }

        public int query() {
            if (top < 0) return -1;
            else return st[top];
        }

        public void pop() {
            if (top >= 0) {
                top--;
            } else {
                System.out.println("栈内元素为空！");
            }
        }

        public boolean empty() {
            return top == -1;
        }

    }

    public static void main(String[] args) {
        MyStack stt = new MyStack();
        Scanner sc = new Scanner(System.in);

        int m = Integer.valueOf(sc.nextLine());

        while (m-- > 0) {
            System.out.println("top = " + stt.top);
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
//                System.out.println(str[1]);
                stt.push(Integer.valueOf(str[1]));
            }
        }
    }
}
