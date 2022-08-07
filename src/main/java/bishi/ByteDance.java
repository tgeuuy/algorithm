package bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ByteDance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("零", 0);
        map.put("一", 1);
        map.put("二", 2);
        map.put("三", 3);
        map.put("四", 4);
        map.put("五", 5);
        map.put("六", 6);
        map.put("七", 7);
        map.put("八", 8);
        map.put("九", 9);
        map.put("十", 10);
        map.put("百", 100);
        map.put("千", 1000);
        map.put("万", 10000);
        while (true) {
            String str = sc.nextLine();
            int res = 0;
            int i = 0;
            int qian = 0, bai = 0, shi = 0, ge = 0;
            while (i < str.length()) {
                String ch = str.substring(i, i + 1);
                if ("万".equals(ch)) {
                    res = (qian + bai + shi + ge) * 10000;
                    qian = 0;
                    bai = 0;
                    shi = 0;
                    ge = 0;
                    i++;
                } else if ("千".equals(ch)) {
                    String num = str.substring(i - 1, i);
                    qian = map.get(num) * 1000;
                    i++;
                } else if ("百".equals(ch)) {
                    String num = str.substring(i - 1, i);
                    bai = map.get(num) * 100;
                    i++;
                } else if ("十".equals(ch)) {
                    String num = str.substring(i - 1, i);
                    shi = map.get(num) * 10;
                    i++;
                } else {
                    ge = map.get(ch);
                    i++;
                }
                //九千二百三十二万六千四百零二
            }
            res += qian + bai + shi + ge;
            System.out.println(res);
        }
    }


}
