package acwing.AC_4269;


import java.util.*;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  14:17
 * @Description: TODO
 * @Version: 1.0
 */
public class Main{
    static int N = 100010;
    static int[] a = new int[N];//存储校友的出生年月日
    static int[] b = new int[N];//存储来宾的出生年月日
    static Map<String,Integer> map = new HashMap<>();//存储所有校友的身份证
    static Map<Integer,String> v = new HashMap<>();//存储出生年月日对应的身份证

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n -- > 0){
            String str = scan.next(); //输入身份证
            map.put(str,1);  //存储身份证，给个值，表示不空
        }
        int m = scan.nextInt();
        int cnt = 0;  //校友的数量
        int k = 0;   //来宾的数量
        while (m -- > 0){
            String str = scan.next();  //输入来参加校庆的人的身份证
            v.put(Integer.parseInt(str.substring(6,14)),str);  //存储当前身份证的出生年月日，对应的身份证
            //如果这个身份证不是空的，说明是校友
            if (map.get(str) != null){
                a[cnt ++ ] = Integer.parseInt(str.substring(6,14));//那就将他的出身年月日存到a数组里
            }else {    //否则就是来宾
                b[k ++] = Integer.parseInt(str.substring(6,14));   //将他的出生年月日存到b数组里
            }
        }
        System.out.println(cnt);  //输出校友数量

        //如果校友数量不为0
        if (cnt != 0){
            Arrays.sort(a,0,cnt); //将所有校友的出生年月日排个序，输出最年长的，也就是最小的那个的身份证
            System.out.println(v.get(a[0]));
        }else{
            Arrays.sort(b,0,k);//将所有来宾的出生年月日排个序，输出最年长的，也就是最小的那个的身份证
            System.out.println(v.get(b[0]));
        }
    }
}