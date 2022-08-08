package designpattern.SingletonPattern;

public class AnimalSingleton02 {


    public static void main(String[] args) {
        Animal02 a1 = Animal02.getAnimal();
        Animal02 a2 = Animal02.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 饿汉式（静态代码块实现）
 */
class Animal02 {


    // 构造器私有化，外部不能new
    private Animal02() {
    }

    // 本类内部创建对象实例
    private static Animal02 animal;

    //在静态代码快中，创建实例
    static {
        animal = new Animal02();
    }

    //提供一个共有静态方法返回对象实例
    public static Animal02 getAnimal() {
        return animal;
    }


}
