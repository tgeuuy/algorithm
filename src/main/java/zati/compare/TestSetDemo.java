package zati.compare;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSetDemo {
//    public static void main(String[] args) {
//        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int num = o1.getAge() - o2.getAge();
//                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
//                return num2;
//            }
//        });
//        Student s1 = new Student("Lucy", 20);
//        Student s2 = new Student("Tom", 21);
//        Student s3 = new Student("Jim", 19);
//        Student s4 = new Student("Frank", 28);
//        Student s5 = new Student("Jim", 19);
//        Student s6 = new Student("Alice", 28);
//
//        ts.add(s1);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s4);
//        ts.add(s5);
//        ts.add(s6);
//        for(Student s:ts){
//            System.out.println(s.toString());
//        }
//    }

    public static void main(String[] args) {
        TreeSet<Student2> ts = new TreeSet<>();
        Student2 s1 = new Student2("Lucy", 20);
        Student2 s2 = new Student2("Tom", 21);
        Student2 s3 = new Student2("Jim", 19);
        Student2 s4 = new Student2("Frank", 28);
        Student2 s5 = new Student2("Jim", 19);
        Student2 s6 = new Student2("Alice", 28);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for(Student2 s:ts){
            System.out.println(s.toString());
        }
    }


}
