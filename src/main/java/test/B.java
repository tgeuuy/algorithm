package test;

public class B extends A {
    private int c;

    public B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }


    @Override
    public int count() {

        return c;
    }
}
