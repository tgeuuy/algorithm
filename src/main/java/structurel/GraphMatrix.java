package structurel;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//        8 9
//        1 2
//        1 3
//        1 4
//        2 5
//        2 6
//        3 7
//        4 7
//        4 8
//        7 8
public class GraphMatrix {
    static int vexNums;
    static int[][] edge;
    static int[] st;
    static int[] vex;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 点的数量
        vexNums = scanner.nextInt();
        int edgeNums = scanner.nextInt();
        //是否访问 标记数组
        st = new int[vexNums + 1];
        Arrays.fill(st, 0);
        //存点
        vex = new int[vexNums + 1];
        for (int i = 1; i <= vexNums; i++) {//点就是按顺序来的
            vex[i] = i;
        }

        //存边
        edge = new int[vexNums + 1][vexNums + 1];//存边
        //邻接矩阵初始化
        for (int i = 1; i <= vexNums; i++) {
            for (int j = 1; j <= vexNums; j++) {
                edge[i][j] = 0;
            }
        }
        //输入边和点的信息,有向图，只用记录一个
        for (int i = 1; i <= edgeNums; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edge[a][b] = 1;
        }
        dfs(1);
        System.out.println("");
        Arrays.fill(st, 0);
        bfs();
    }

    public static void dfs(int index) {
        if (index == vexNums + 1)
            return;
        if (st[index] == 0) {
            st[index] = 1;
            System.out.print(index + " ");
            for (int i = 1; i <= vexNums; i++) {
                if (st[i] == 0 && edge[index][i] == 1)
                    dfs(i);
            }
        }
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(vex[1]);//将首元素入队
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            st[temp] = 1;
            System.out.print(temp + " ");
            for (int i = 1; i <= vexNums; i++) {
                if (edge[temp][i] == 1 && st[i] == 0) {
                    queue.add(i);
                    st[i] = 1;
                }
            }
        }
    }
}
