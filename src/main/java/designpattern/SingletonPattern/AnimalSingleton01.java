package designpattern.SingletonPattern;

public class AnimalSingleton01 {


    public static void main(String[] args) {
        Animal01 a1 = Animal01.getAnimal();
        Animal01 a2 = Animal01.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 饿汉式（静态常量）
 */
class Animal01 {

    // 构造器私有化，外部不能new
    private Animal01() {
    }

    // 本类内部创建对象实例
    private static final Animal01 animal = new Animal01();

    //提供一个共有静态方法返回对象实例
    public static Animal01 getAnimal() {
        return animal;
    }


}
