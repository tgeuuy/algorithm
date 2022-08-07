package acwing.AC_3302;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-06  23:13
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static Stack<Character> optST = new Stack<>();
    public static Stack<Integer> numST = new Stack<>();
    public static Map<Character, Integer> rank = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        rank.put('+', 1);
        rank.put('-', 1);
        rank.put('*', 1);
        rank.put('/', 1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int j = i;
            if (Character.isDigit(ch)) {
                int x = 0;
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    x = x * 10 + (str.charAt(j) - '0');
                    j++;
                }
                numST.push(x);
                i = j - 1;
            } else if (ch == '(') {
                optST.push(ch);
            } else if (ch == ')') {
                while (optST.peek() != '(')  cal();
                optST.pop();
            } else {
                if (!optST.isEmpty() && optST.peek() != '(' && rank.get(optST.peek()) >= rank.get(ch)) {
                    cal();
                }
                optST.push(ch);
            }


        }
        while (!optST.isEmpty()) cal();
        System.out.println(numST.peek());

    }

    private static void cal() {
        int a = numST.pop();
        int b = numST.pop();
        char ch = optST.pop();
        if (ch == '+') numST.push(a + b);
        else if (ch == '-') numST.push(b - a);
        else if (ch == '*') numST.push(b * a);
        else numST.push(b / a);
    }


}
