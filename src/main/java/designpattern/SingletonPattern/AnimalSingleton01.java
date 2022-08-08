package designpattern.SingletonPattern;

public class AnimalSingleton01 {


    public static void main(String[] args) {
        Animal a1 = Animal.getAnimal();
        Animal a2 = Animal.getAnimal();
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);
    }
}


/**
 * 饿汉式（静态常量）
 */
class Animal {


    private Animal() {
    }

    private static final Animal animal = new Animal();

    public static Animal getAnimal() {
        return animal;
    }


}
