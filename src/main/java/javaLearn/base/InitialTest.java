package javaLearn.base;


public class InitialTest {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}

class A {
    static { // 父类静态代码块
        System.out.print("A");
    }

    public A() { // 父类构造器
        System.out.print("a");
    }
}

class B extends A {
    static { // 子类静态代码块
        System.out.print("B");
    }

    public B() { // 子类构造器
        System.out.print("b");
    }
}
