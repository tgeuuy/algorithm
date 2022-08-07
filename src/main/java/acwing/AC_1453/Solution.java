package acwing.AC_1453;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/11/3 9:25
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        if (k == str.length()) {
            System.out.println(0);
            return;
        }
        LinkedList<Character> stack = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            while (!stack.isEmpty() && count < k && stack.peek() > str.charAt(i)) {
                count++;
                stack.pop();
            }
            stack.push(str.charAt(i));
        }
        while (count < k) {
            stack.pop();
            count++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String res = sb.reverse().toString();
        int i = 0;
        for (; i < res.length(); i++) {
            if(res.charAt(i)!='0') break;
        }

        System.out.println(res.substring(Math.min(i,res.length()-1)));

    }
}
