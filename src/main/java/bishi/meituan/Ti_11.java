package bishi.meituan;

import structurel.TreeNode;

import java.util.*;

public class Ti_11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n - 1];
        char[] str = new char[n + 1];
        Map<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < n - 1; i++) {
            p[i] = sc.nextInt();
        }
        String pp = sc.next();
        for (int i = 0; i < pp.length(); i++) str[i + 1] = pp.charAt(i);
        for (int i = 0; i < n - 1; i++) {
            if (map.containsKey(p[i])) {
                ArrayList<Integer> list = map.get(p[i]);
                list.add(i + 2);
                map.put(p[i], list);
            } else {
                ArrayList list = new ArrayList();
                list.add(i + 2);
                map.put(p[i], list);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int k = entry.getKey();
            List<Integer> v = entry.getValue();
            if (!map.containsKey(k)) res.add(1);
            else {
                Map<Integer, Set<Character>> setMap = new TreeMap<>();
                dfs(k, str, map, setMap);
                res.add(setMap.get(k).size());
            }
        }
        for (int v :res) {
            System.out.print(v + " ");
        }

    }

    private static void dfs(int k, char[] str, Map<Integer, ArrayList<Integer>> map, Map<Integer, Set<Character>> setMap) {
        if (!map.containsKey(k)) return;
        if (!setMap.containsKey(k)) {
            Set<Character> set = new HashSet<>();
            set.add(str[k]);
            setMap.put(k, set);
        }
        for (Integer child : map.get(k)) {
            Set<Character> characters = setMap.get(k);
            characters.add(str[k]);
            setMap.put(k,characters);
            dfs(child, str, map, setMap);
        }
    }


}
