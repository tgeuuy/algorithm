package acwing.AC_761;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int c = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= '0' && st.charAt(i) <= '9') c++;
        }
        System.out.println(c);
    }
}
