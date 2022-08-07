package acwing.AC_723;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (c % b == 0) {
                    System.out.print("PUM");
                    c++;
                } else {
                    System.out.print(c + " ");
                    c++;
                }

            }
            System.out.println();
        }


    }
}
