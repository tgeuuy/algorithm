package acwing.AC_670;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_670
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  14:34
 * @Description: TODO
 * @Version: 1.0
 */
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();
        if("vertebrado".equals(one)){
            if("ave".equals(two)){
                if("carnivoro".equals(three)){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if("onivoro".equals(three)){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if("inseto".equals(two)){
                if("hematofago".equals(three)){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if("hematofago".equals(three)){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
