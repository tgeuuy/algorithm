package leetcode.leet_204;

import org.junit.Test;

public class CountPrimes {

    public boolean[] st = new boolean[5000010];
    public int[] prime = new int[5000010];
    public int cunt = 0;

    public int countPrimes(int n) {
       // if (n == 2) return 1;
        if (n <= 2) return 0;
        for (int i = 2; i <= n; i++) {
            if (!st[i]) System.out.print(i+ " ");
            if (st[i])  continue;
            System.out.println();
            cunt++;
            for (int j = i + i; j <= n; j += i) {
                st[j] = true;
//                System.out.print(j+" ");
            }
        }
        return cunt;

    }

    @Test
    public void practice() {
        System.out.println(countPrimes(3));
    }

}
