package niuke.jiandan;

import org.junit.Test;

import java.util.Stack;

public class NC_76 {


    public Stack<Integer> stack1 = new Stack<Integer>();
    public Stack<Integer> stack2 = new Stack<Integer>();

    @Test
    public void practice() {
        String[] str = new String[]{"PSH1", "PSH2", "POP", "POP"};
        for (int i = 0; i < str.length; i++) {
            String st = str[i];

            if (st.startsWith("PSH")) {
                String node = st.substring(3);
                push(Integer.valueOf(node));
            } else {
                int res = pop();
                System.out.println("res=" + res);
            }
        }
    }

    public void push(int node) {
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
        stack1.push(node);
    }

    public int pop() {

            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }


        return stack2.pop();

    }
}
