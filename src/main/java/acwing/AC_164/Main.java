package acwing.AC_164;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;


/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  15:28
 * @Description: TODO
 * @Version: 1.0
 */



public class Main {
    static ArrayList<ArrayList<Integer>> a;
    static int[] b;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = buf.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        a = new ArrayList<>();
        b = new int[n];

        for (int i = 0; i < n;i++){
            a.add(new ArrayList<>());
        }

        while ( m != 0){
            line = buf.readLine().split(" ");
            int x = Integer.parseInt(line[0]) - 1;
            int y = Integer.parseInt(line[1]) - 1;
            m--;
            a.get(x).add(y);
            b[y] +=1;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> aov = new ArrayList<>();

        for (int i = 0; i< n; i++){
            if (b[i] == 0){
                dq.addFirst(i);
            }
        }

        while (!dq.isEmpty()){
            int x = dq.pollLast();
            aov.add(x);

            for (int i = 0 ; i < a.get(x).size(); i++){
                b[a.get(x).get(i)] --;
                if (b[a.get(x).get(i)] == 0){
                    dq.addFirst(a.get(x).get(i));
                }
            }

        }
        BitSet[] c = new BitSet[n+1];
        for (int i = aov.size()-1; i >= 0; i--){
            int x = aov.get(i);
            c[x] = new BitSet();
            c[x].set(x);
            for (int j = 0; j< a.get(x).size();j++){
                c[x].or(c[a.get(x).get(j)]);
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(c[i].cardinality());
        }
    }

}


