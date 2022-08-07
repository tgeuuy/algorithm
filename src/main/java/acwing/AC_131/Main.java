package acwing.AC_131;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 7 2 1 4 5 1 3 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            // 7 2 1 4 5 1 3 3
            int[] arr = ioRead(br);
            int N = arr.length - 1;
            if (arr[0] == 0 && N == 0) {
                break;
            }

            int[] nums = new int[N + 2];
            // [0, 2, 1, 4, 5, 1, 3, 3, 0]
            System.arraycopy(arr, 1, nums, 1, N);
            nums[0] = 0;
            nums[N + 1] = 0;

            Deque<Integer> stack1 = new LinkedList<>();
            int[] L = new int[N + 2];
            for (int i = 0; i <= N + 1; i++) {
                // 从左往右找第一个比nums[i]小的数
                while (!stack1.isEmpty() && nums[stack1.peek()] >= nums[i]) stack1.pop();
                if (stack1.isEmpty()) L[i] = -1;
                else L[i] = stack1.peek();
                stack1.push(i);
            }

            int[] R = new int[N + 2];
            Deque<Integer> stack2 = new LinkedList<>();
            for (int i = N + 1; i >= 0; i--) {
                while (!stack2.isEmpty() && nums[stack2.peek()] >= nums[i]) stack2.pop();
                if (stack2.isEmpty()) R[i] = -1;
                else R[i] = stack2.peek();
                stack2.push(i);
            }
            long res = 0;
            for (int i = 0; i <= N + 1; i++) {
                res = Math.max(res, (long) (Math.abs(R[i] - L[i]) - 1) * nums[i]);
            }

            System.out.println(res);


        }
        br.close();
    }

    private static int[] ioRead(BufferedReader br) throws IOException {
        return Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
