package bishi.shenceshuju;

import java.util.*;

public class T2 {
    static Map<Integer, ArrayList<Integer>> map = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (map.containsKey(b)) {
                map.get(b).add(a);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                map.put(b, list);
            }
        }
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();


        List<Integer> startList = map.get(1);
        int res = dfs(1, s1, s2, startList);
        System.out.println(res);

    }

    private static int dfs(int start, int s1, int s2, List<Integer> startList) {
        if (startList.contains(s1) && startList.contains(s2)) {
            return start;
        }
        return 1;

    }
}
