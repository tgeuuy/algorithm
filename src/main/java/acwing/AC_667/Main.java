package acwing.AC_667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[1]);
        if (a >= b ||  b ==  0 ) System.out.printf("O JOGO DUROU %d HORA(S)\n", b + 24 - a);
        else System.out.printf("O JOGO DUROU %d HORA(S)\n", b - a);
    }
}
