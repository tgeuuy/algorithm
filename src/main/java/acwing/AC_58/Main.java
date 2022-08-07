package acwing.AC_58;


import java.util.*;

/**
 * @Author tgeuuy
 * @Date 2021/12/10 15:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 3244, 321};
        String res = printMinNumber(nums);
        System.out.println("res=" + res);

    }

    private static String printMinNumber(int[] nums) {

        StringBuilder res = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int v : nums) list.add(v);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        for (int v : list) res.append(v);
        return res.toString();
    }
}


