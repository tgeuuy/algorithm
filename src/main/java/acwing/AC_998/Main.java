package acwing.AC_998;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_998
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  15:32
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    int N, M, maxN = 100010;
    int[] arr = new int[maxN], ops = new int[maxN];

    public static void main(String[] args) throws IOException {
        new Main().init();
    }

    void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str =  br.readLine().split(" ");
        N = Integer.parseInt(str[0]); M = Integer.parseInt(str[1]);

        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            char c = str[0].charAt(0);
            if (c == 'O') ops[i] = 0;
            else if (c == 'X') ops[i] = 1;
            else ops[i] = 2;

            arr[i] = Integer.parseInt(str[1]);
        }

        int res = 0;
        for (int i = 0; i < 30; i++) {
            if (M>>i > 0) {
                int a = calc(0, i), b = calc(1, i);
                if (a >= b) res |= a<<i;
                else res |= b<<i;
            } else res |= calc(0, i)<<i;
        }
        System.out.println(res);
    }

    int calc(int n, int j) {
        for (int i = 0; i < N; i++) {
            if (ops[i] == 0) n |= arr[i]>>j & 1;
            else if (ops[i] == 1) n ^= arr[i]>>j & 1;
            else n &= arr[i]>>j & 1;
        }
        return n;
    }
}
