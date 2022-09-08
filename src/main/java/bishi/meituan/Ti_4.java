package bishi.meituan;


import java.util.Scanner;

public class Ti_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int res = 0;
        int l = 0 ;
        while (l < n - m + 1) {
            int index = 0;
            int indexs = l;
            while (index < m) {
                if (s.charAt(indexs) == t.charAt(index) || t.charAt(index) == '*'){
                    indexs ++;
                    index ++;
                }else {
                    break;
                }

            }
            l ++ ;
            if (indexs - l + 1 == m) {
                res++;
            }

        }
        System.out.println(res);
    }
}
