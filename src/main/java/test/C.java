package test;

public class C {
    public static void main(String[] args) {
        A a = new A(3,4);
        B b = new B(3,4,5);
        System.out.println(a.count());
        System.out.println(b.count());
    }
}
