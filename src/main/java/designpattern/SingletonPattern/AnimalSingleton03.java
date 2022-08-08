package designpattern.SingletonPattern;

public class AnimalSingleton03 {
    public static void main(String[] args) {
        Animal03 a1 = Animal03.getAnimal();
        Animal03 a2 = Animal03.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 懒汉式（线程不安全）
 */
class Animal03 {

    // 本类内部创建对象实例
    private static Animal03 animal;

    // 构造器私有化，外部不能new
    private Animal03() {
    }


    //提供一个静态的共有方法，当使用到该方法时，才会去创建animal
    public static Animal03 getAnimal() {
        if (animal == null) {
            animal =  new Animal03();
        }
        return animal;
    }


}