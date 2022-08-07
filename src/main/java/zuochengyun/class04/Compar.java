package zuochengyun.class04;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Compar {


    public static class MyComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    public static class Student {
        public int id;
        public int age;

        public Student(int id, int age) {
            this.id = id;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", age=" + age +
                    '}';
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        heap.add(4);
        heap.add(5);
        heap.add(54);
        heap.add(3454);
        heap.add(3);
        heap.add(42);
        heap.add(1);
        heap.add(46);
        heap.add(6);


        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + "  ");
        }

        System.out.println();
        System.out.println("*****************************");


        Student a = new Student(22, 444);
        Student b = new Student(44, 23425234);
        Student c = new Student(4, 234223);
        Student d = new Student(434, 23422);
        Student e = new Student(45, 232);
        Student f = new Student(422, 42);



       /* PriorityQueue<Student> hq=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });*/
        PriorityQueue<Student> hq = new PriorityQueue<>(new MyComparator());

        hq.add(a);
        hq.add(b);
        hq.add(c);
        hq.add(d);
        hq.add(e);
        hq.add(f);


        while (!hq.isEmpty()) {
            System.out.println(hq.poll());
        }

    }
}
