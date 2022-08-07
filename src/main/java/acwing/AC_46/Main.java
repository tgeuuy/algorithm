package acwing.AC_46;

/**
 * @Author tgeuuy
 * @Date 2021/12/2 9:24
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[] sequence = {7, 4, 6, 5, 9, 11, 10, 8};
        boolean res = verifySequenceOfBST(sequence);
        System.out.println("res=" + res);

    }


    public static boolean verifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return true;
        return judge(sequence, 0, sequence.length - 1);
    }

    private static boolean judge(int[] sequence, int l, int r) {
        if (l > r) return true;
        int root = sequence[r];
        int k = l;
        while (k < r && sequence[k] < root) k++;
        for (int i = k; i < r; i++) {
            if (sequence[i] < sequence[r]) return false;
        }
        return judge(sequence, l, k - 1) && judge(sequence, k, r - 1);
    }


}
