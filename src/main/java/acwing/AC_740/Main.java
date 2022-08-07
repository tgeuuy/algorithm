package acwing.AC_740;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/13 10:23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[20];
        for (int i = 0; i < 20; i++) nums[i] = sc.nextInt();
        for (int i = 19, j = 0; i > j; i--, j++) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
        }
        for (int i = 0; i < 20; i++) System.out.printf("N[%d] =%d\n", i, nums[i]);
    }
}
