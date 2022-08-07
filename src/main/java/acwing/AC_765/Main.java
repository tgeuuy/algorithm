package acwing.AC_765;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            sb.append(str.charAt(i)).append(" ");
        }
        System.out.println(sb.toString());

    }
}
