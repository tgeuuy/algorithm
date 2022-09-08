package bishi.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Ti_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) arr[i] = sc.nextInt();
        if(2 * y < n || 2 * x > n) {
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[x - 1]);
        return;
    }

}
