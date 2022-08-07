package acwing.AC_671;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 15:55
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextByte();
        if (ddd == 61) System.out.println("Brasilia");
        else if (ddd == 71) System.out.println("Salvador");
        else if (ddd == 11) System.out.println("Sao Paulo");
        else if (ddd == 21) System.out.println("Rio de Janeiro");
        else if (ddd == 32) System.out.println("Juiz de Fora");
        else if (ddd == 19) System.out.println("Campinas");
        else if (ddd == 27) System.out.println("Vitoria");
        else if (ddd == 31) System.out.println("Belo horizonte");
        else System.out.println("DDD nao cadastrado");
    }
}
