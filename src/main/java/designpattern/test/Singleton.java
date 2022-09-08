package designpattern.test;

public class Singleton {


    public static void main(String[] args) {
        Animal a1 = Animal.getInstance();
        Animal a2 = Animal.getInstance();
        System.out.println(a1 == a2);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }
}


class Animal {
    private static volatile Animal animal;

    private Animal() {
    }

    public static Animal getInstance() {
        if (animal == null) {
            synchronized (Animal.class) {
                if (animal == null) {
                    animal = new Animal();
                }
            }
        }
        return animal;
    }


}
