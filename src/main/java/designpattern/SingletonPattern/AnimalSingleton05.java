package designpattern.SingletonPattern;

public class AnimalSingleton05 {
    public static void main(String[] args) {
        Animal05 a1 = Animal05.getAnimal();
        Animal05 a2 = Animal05.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 懒汉式（双重检查，线程安全）
 */
class Animal05 {

    // 本类内部创建对象实例
    private static volatile Animal05 animal;

    // 构造器私有化，外部不能new
    private Animal05() {
    }


    //提供一个静态的共有方法，当使用到该方法时，才会去创建animal
    public static Animal05 getAnimal() {
        if (animal == null) {
            synchronized (Animal05.class) {
                if (animal == null){
                    animal = new Animal05();
                }

            }
        }
        return animal;
    }


}
