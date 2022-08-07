package acwing.AC_763;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        for (int i = 0; i < n; i++) {
            String a = cin.next();
            String b = cin.next();

            if (a.equals("Hunter") && b.equals("Gun")) System.out.println("Player1");
            else if (a.equals("Bear") && b.equals("Hunter")) System.out.println("Player1");
            else if (a.equals("Gun") && b.equals("Bear")) System.out.println("Player1");
            else if (a.equals(b)) System.out.println("Tie");
            else System.out.println("Player2");

        }
    }
}

