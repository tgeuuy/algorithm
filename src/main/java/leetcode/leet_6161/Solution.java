package leetcode.leet_6161;


import structurel.ListNode;



public class Solution {
    static class LinkNode{
        char val;
        ListNode next;
        public  LinkNode(char c){
            this.val = c;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String res = removeStars(s);
        System.out.println(res);
    }

    public static String removeStars(String s) {
        if (!s.contains("*")) return s;
        ListNode head = new ListNode('0');
        ListNode tail = head;
        for (int i = 0; i < s.length(); i++) {
            ListNode node = new ListNode();
        }

        return null;
    }
}
