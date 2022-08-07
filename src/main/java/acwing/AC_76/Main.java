package acwing.AC_76;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tgeuuy
 * @Date 2021/12/20 10:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> res = findContinuousSequence(13244);
        System.out.println(res.size());
        System.out.println(res.toString());

    }

    public static List<List<Integer>> findContinuousSequence(int n) {

        List<List<Integer>> res = new ArrayList<>();

        int left = 1, right = 2;
        while (left < right && right <= n) {
            int sum = (right + left) * (right - left + 1) / 2;
            if (sum == n) {
                List<Integer> lev = new ArrayList<>();
                for (int i = left; i <= right; i++) lev.add(i);
                res.add(lev);
                left++;
                right++;
            } else if (sum < n) right++;
            else left++;
        }
        return res;

    }
}
