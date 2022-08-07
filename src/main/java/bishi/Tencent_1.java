package bishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tencent_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            String str = sc.nextLine();
            list.add(str);
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < list.get(0).length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (String s : list) {
                sb.append(s.charAt(i));
            }
            int index = 0;
            while (index < sb.length() && sb.charAt(index) == '0') index++;
            if (index < sb.length()) arr.add(Integer.valueOf(sb.substring(index)));
            if (index == sb.length()) arr.add(0);
//            System.out.println(sb.substring(index));
        }
        Collections.sort(arr);
        for (int v : arr) System.out.print(v + " ");
    }
}
