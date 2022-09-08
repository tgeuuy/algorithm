package test;

public class A {

    private int a;
    private int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int count() {
        return a + b;
    }


    public static void main(String[] args) {
        long a = 24L * 60 * 60 * 1000 * 1000;
        System.out.println(a / 1000 / 1000 / 60 / 60);
    }
}
