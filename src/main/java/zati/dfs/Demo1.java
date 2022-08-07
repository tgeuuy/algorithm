package zati.dfs;

import java.util.*;

public class Demo1 {
    static List<String> res = new ArrayList<>();
    static Deque<Character> path = new LinkedList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
        dfs(list, 0, 0);
        System.out.println(res);
    }

    public static void dfs(List<String> list, int p, int t) {
        if (p == list.size() && path.size() == list.size()) {
            StringBuilder sb = new StringBuilder();
            for (Character ch : path) {
                sb.append(ch);
            }
            res.add(new String(sb));
            return;
        }
        for (int i = p; i < list.size(); i++) {
            for (int j = t; j < list.get(p).length(); j++) {
                path.addLast(list.get(p).charAt(j));
                dfs(list, p + 1, j );
                path.removeLast();
            }
        }

    }
}
