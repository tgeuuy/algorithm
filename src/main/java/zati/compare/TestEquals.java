package zati.compare;

public class TestEquals {

    public static void main(String[] args) {
        Student s1 = new Student("a", 12);
        Student s2 = new Student("a", 12);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(s1.equals(s2));
    }
}