package acwing.AC_742;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 11:33
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
                index = i;
            }
        }
        System.out.printf("Minimum value: %d \n  Position: %d", min, index);

    }
}
