package bishi;


import java.util.Scanner;

public class BianLiFen_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nn = sc.nextLine();
        String mm = sc.nextLine();
        String kk = sc.nextLine();
        int tal = sc.nextInt();

        String[] ks = nn.split(" ");
        String[] ms = mm.split(" ");
        String[] ns = kk.split(" ");



        int[] n = new int[ns.length];
        for(int i = 0 ; i < n.length; i++) n[i] = Integer.valueOf(ns[i]);

        int[] m = new int[ms.length];
        for(int i = 0 ; i < m.length; i++) m[i] = Integer.valueOf(ms[i]);

        int[] k = new int[ks.length];
        for(int i = 0 ; i < k.length; i++) k[i] = Integer.valueOf(ks[i]);

        //  for(String v: ns) System.out.print(v+" ");
        //  System.out.println();


        //Scanner sc1 = new Scanner(System.in);


        int res = 0;

        // for(int v: n) System.out.print(v+" ");
        //System.out.println();

        for(int i = 0 ; i < n.length; i++){
            if(n[i] >= tal) continue;
            for(int j = 0; j < m.length; j ++){
                if(n[i] + m[j] >= tal)  continue;
                for(int p = 0 ; p < k.length ; p ++){
                    if(n[i] + m[j] + k[p] <= tal){
                        res ++;
                        res %= 1000000007;
                    }
                }
            }
        }
        if(res == 0) res = -1;
        System.out.println(res);
    }
}