package zati.compare;

import java.util.Objects;




public class Student2 implements Comparable<Student2>{
    private int age;
    private String name;

    public Student2() {
    }

    public Student2(String name, int age) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return age == student.age && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student2 o) {
        int num1 = this.age-o.age;
        int num2 = num1==0?this.getName().compareTo(o.name):num1;
        return num2;
    }
}

