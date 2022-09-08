package acwing.AC_803;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        while (n-- > 0) {
            int[] arr = new int[2];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[1];
            }
        });
        int res = 0;
        int left = list.get(0)[0], right = list.get(0)[1];
        for (int[] arr : list) {
            if (arr[0] <= right) right = Math.max(arr[1], right);
            else {
                res++;
                left = arr[0];
                right = arr[1];
            }
        }
        System.out.println(res);
    }
}
