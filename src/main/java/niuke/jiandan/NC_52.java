package niuke.jiandan;


import javafx.stage.Screen;

import java.util.Scanner;
import java.util.Stack;

public class NC_52 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (String s : args) {
//            System.out.println(s);
//        }

//        while (true) {
//            String str = sc.next();
//            boolean res = isValid(str);
//            System.out.println(res);
//
//        }
        System.out.println(isValid("{{}}[[]](()"));
    }
    public static boolean isValid(String s) {
        // write code here
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.isEmpty()) stack.add(ch);
            if (ch == ')' && stack.peek() == '(') stack.pop();
            else if (ch == ']' && stack.peek() == '[') stack.pop();
            else if (ch == '}' && stack.peek() == '{') stack.pop();
            else stack.push(ch);
        }
            if (stack.isEmpty()) return true;
            else return false;
        }

}
