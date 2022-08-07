package acwing.AC_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_01
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  13:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split(" ");
        System.out.println(Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]));
    }
}
