package zuochengyun.class01;

public class Code07_EvenTimeOddTimes {
    //arr中，只有一种数，出现奇数次
    public static void printOddTimeNum1(int[] arr) {
        int eor = 0;
        for (int num : arr) {
            eor ^= num;
        }
        System.out.println(eor);
    }

    //数组中，两种数出现奇数次，其他偶数次，打印这两种数
    public static void printOddTimeNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        //eor = a ^ b ;
        //eor != 0
        // eor 必然有一个位置上是1
        int rightOne = eor & (~eor + 1); //提取出最右的1
        int onlyOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }

        System.out.println(onlyOne + " " + (eor ^ onlyOne));

    }


    public static int bit1counts(int N) {
        int count = 0;
        while (N != 0) {
            int rightOne = N & (~N + 1);
            count++;
            N ^= rightOne;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(bit1counts(Integer.MIN_VALUE));
    }
}
