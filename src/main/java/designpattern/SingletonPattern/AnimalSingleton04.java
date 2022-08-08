package designpattern.SingletonPattern;

public class AnimalSingleton04 {

    public static void main(String[] args) {
        Animal04 a1 = Animal04.getAnimal();
        Animal04 a2 = Animal04.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 懒汉式（线程安全）
 */
class Animal04 {


    // 本类内部创建对象实例
    private static Animal04 animal;

    // 构造器私有化，外部不能new
    private Animal04() {
    }

//
//    //提供一个共有静态方法返回对象实例
//    public synchronized static Animal04 getAnimal() {
//        if (animal == null) {
//            animal = new Animal04();
//        }
//        return animal;
//    }

    //提供一个共有静态方法返回对象实例
    public synchronized static Animal04 getAnimal() {

        if (animal == null) {
            synchronized (Animal04.class) {
                animal = new Animal04();
            }
        }

        return animal;
    }


}
