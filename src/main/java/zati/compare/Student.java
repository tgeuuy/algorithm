package zati.compare;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            System.out.println("s1 "+getClass());
            System.out.println("s2 "+ getClass());
            return false;
        }
        Student student = (Student) o;
        return age == student.age && name.equals(student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
