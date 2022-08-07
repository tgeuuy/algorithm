package leetcode.leet_1418;

import org.junit.Test;

import java.util.*;

public class Solution {

    @Test
    public void test() {

        String[][] orders = {{"David", "3", "Ceviche"},
                {"Corina", "10", "Beef Burrito"},
                {"David", "3", "Fried Chicken"},
                {"Carla", "5", "Water"},
                {"Carla", "5", "Ceviche"},
                {"Rous", "3", "Ceviche"}};
        List<List<String>> ordersll = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            List<String> oo = new ArrayList<>();
            oo.addAll(Arrays.asList(orders[i]));
            ordersll.add(oo);
        }

//        for (List<String> list : ordersll) System.out.println(list);


        System.out.println("res=" + displayTable(ordersll));
    }

    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> res = new ArrayList<>();
        HashSet<String> tables = new HashSet<>();
        HashSet<String> caiming = new HashSet<>();
        HashMap<String, List<String>> everytable = new HashMap<>();

        for (List<String> order : orders) {
            tables.add(order.get(1));
        }

        for (List<String> order : orders) {
            caiming.add(order.get(2));
        }
        Arrays.sort((String[]) caiming.toArray());


        for (String tt : tables) {
            List<String> eett = new ArrayList<>();
            for (List<String> order : orders) {
                if (order.get(1).equals(tt)) {
                    eett.add(order.get(2));
                }
            }
            everytable.put(tt, eett);
        }

        List<String> headList = new ArrayList<>();
        headList.add("Table");
        headList.addAll(caiming);
        res.add(headList);



        for (Map.Entry<String, List<String>> entry : everytable.entrySet()) {
            List<String> ll = new ArrayList<>();
            int B = 0, C = 0, F = 0, W = 0;
            String tablenumber = entry.getKey();
            ll.add(tablenumber);
            List<String> menu = entry.getValue();
            for (String s : menu) {
                if (s.equals("Beef Burrito")) B++;
                if (s.equals("Ceviche")) C++;
                if (s.equals("Fried Chicken")) F++;
                if (s.equals("Water")) W++;
            }
            for (String s : caiming) {
                if (s.equals("Beef Burrito")) ll.add(String.valueOf(B));
                if (s.equals("Ceviche")) ll.add(String.valueOf(C));
                if (s.equals("Fried Chicken")) ll.add(String.valueOf(F));
                if (s.equals("Water")) ll.add(String.valueOf(W));
            }
            res.add(ll);

        }

        return res;

    }
}
