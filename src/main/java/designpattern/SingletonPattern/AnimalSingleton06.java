package designpattern.SingletonPattern;

public class AnimalSingleton06 {
    public static void main(String[] args) {
        Animal05 a1 = Animal05.getAnimal();
        Animal05 a2 = Animal05.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 懒汉式（静态内部类）
 */
class Animal06 {

//    // 本类内部创建对象实例
//    private static volatile Animal06 animal;

    // 构造器私有化，外部不能new
    private Animal06() {
    }


    private static class Animal06Instance {
        private static final Animal06 INSTANCE = new Animal06();
    }

    public static Animal06 getInstance() {
        return Animal06Instance.INSTANCE;
    }


}
