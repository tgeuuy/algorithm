package bishi;

import java.util.Scanner;


public class RongYao_2 {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[5][2];

            Node[] nodes = new Node[5];

            for (int i = 0; i < 5; i++) {

                nodes[i].x = sc.nextInt();
                nodes[i].y = sc.nextInt();
            }

        }
    }
}
