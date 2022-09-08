package designpattern.test;

import org.junit.Test;

public class TestAn {


    @Test
    public void testCheck() {

        Animalaa a1 = Animalaa.getAnimal();
        Animalaa a2 = Animalaa.getAnimal();
        System.out.println(a2.hashCode());
        System.out.println(a1.hashCode());

    }


}


class Animalaa {
    private static volatile Animalaa animal;

    public Animalaa() {}
    public static Animalaa getAnimal() {
        if (animal == null) {
            synchronized (Animal.class) {
                if (animal == null) {
                    animal = new Animalaa();
                }
            }
        }
        return animal;
    }
}
