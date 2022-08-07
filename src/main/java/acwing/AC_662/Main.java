package acwing.AC_662;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a == 0 && b == 0) System.out.println("Origem");
        else if (a == 0 && b != 0) System.out.println("Eixo Y");
        else if (b == 0 && a != 0) System.out.println("Eixo X");
        else if (a > 0) {
            if (b > 0) System.out.println("Q1");
            else System.out.println("Q4");
        } else {
            if (b > 0) System.out.println("Q2");
            else System.out.println("Q3");
        }
    }
}
