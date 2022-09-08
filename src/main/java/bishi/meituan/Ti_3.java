package bishi.meituan;

import java.util.*;

public class Ti_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(i + 1, arr[i]);
            }

            int m = sc.nextInt();
            String[] sex = new String[m];
            for (int i = 0; i < m; i++) {
                sex[i] = sc.next();
            }
            for (String s : sex) {
                if(s.equals("M"))
                for (Integer key : map.keySet()) {


                }
            }


        }
    }
}
