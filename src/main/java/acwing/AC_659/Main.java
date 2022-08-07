package acwing.AC_659;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_659
 * @Author: tgeuuy
 * @CreateTime: 2022-06-28  09:13
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();

        if (f < 0 || f > 100) System.out.println("Fora de intervalo");
        else if (f >= 0 && f <= 25) System.out.println("Intervalo [0,25]");
        else if (f > 25 && f <= 50) System.out.println("Intervalo (25,50]");
        else if (f > 50 && f <= 75) System.out.println("Intervalo (50,75]");
        else if (f >70 && f <= 100) System.out.println("Intervalo (75,100]");
    }
}
