package acwing.AC_92;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-20  14:33
 * @Description: TODO
 * @Version: 1.0
 */

public class Main{

    public static int n;
    public static List<Integer> res = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(0);
        return;

    }

    public static void dfs(int p){
        if(p == n){
            if(res.size() == 0 ) return;
            else {
                for(int v: res) System.out.print(v + " ");
                System.out.println();
                return;
            }
        }
        res.add(p + 1);
        dfs(p + 1);
        res.remove(res.size() -1);
        dfs(p + 1);

    }
}
