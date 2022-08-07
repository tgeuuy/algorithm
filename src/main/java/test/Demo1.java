package test;


import java.util.*;

public class Demo1 {
    public static class aaa {
        public int a;
        public String age;

        public aaa(int a, String age) {
            this.a = a;
            this.age = age;
        }

    }


    public static void main(String[] args) {
        aaa a = new aaa(12, "dddd");
        System.out.println(a.toString());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> LinkedList = new LinkedList<>();
        List<Integer> Stack = new Stack<>();
        List<Integer> CC = new Vector<>();
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        arrayList.add(333);
        System.out.println(arrayList.toString());

        String str = "aabbcc";
        System.out.println();
        byte[] s = str.getBytes();
        System.out.println(s[0]);


    }
}
