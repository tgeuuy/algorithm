package bishi.qanxin;

import java.util.*;

public class TI {

    static Map<Integer, List<Integer>> map = new HashMap<>();
    static  int res = 0;
    static  int end;
    static boolean[] st;
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3}, {3}, {4}, {}};
        int res = DagPathNum(arr);
        System.out.println(res);
    }

    public static int DagPathNum(int[][] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            List<Integer> ch = new ArrayList<>();
            for (int v : nodes[i]) ch.add(v);
            map.put(i, ch);
        }
        st = new boolean[nodes.length];
        end = nodes.length;

        dfs(0);
        return res;
        // write code here
    }

    private static void dfs(int cur) {
        if(cur == end){
            res++;
            return;
        }

        List<Integer> childen = map.get(cur);
        for(int node : childen){
            if(!st[node]){
                st[node] = true;
                dfs(node);
                st[node] = false;
            }
        }
    }
}
