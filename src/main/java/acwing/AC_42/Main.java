package acwing.AC_42;

import java.util.Stack;

/**
 * @Author tgeuuy
 * @Date 2021/11/30 9:41
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] pushV = {1, 2, 3, 4, 5};
        int[] popV = {4, 5, 3, 2, 1};
        boolean res = isPopOrder(pushV, popV);
        System.out.println("res=" + res);
        int a=Integer.parseInt("4234");

    }

    public static boolean isPopOrder(int[] pushV, int[] popV) {
        if (pushV == null || popV == null) return false;
        if (pushV.length != popV.length) return false;
        Stack<Integer> stack = new Stack<>();
        int len = popV.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            stack.push(pushV[i]);
            while (!stack.isEmpty() && stack.peek() == popV[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
