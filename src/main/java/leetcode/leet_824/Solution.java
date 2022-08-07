package leetcode.leet_824;

public class Solution {

    public static void main(String[] args) {
        String str = "I speak Goat Latin";
        String res = toGoatLatin(str);
        System.out.println("res = " + res);


    }


    public static String toGoatLatin(String sentence) {
        if (sentence.length() == 0) {
            return sentence;
        }
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {

            char ch = words[i].toLowerCase().charAt(0);
            StringBuilder aa = new StringBuilder();
            for (int j = 1; j <= i + 1; j++) {
                aa.append("a");
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append(words[i]).append("ma").append(aa).append(" ");
            } else {
                sb.append(words[i].substring(1)).append(words[i].substring(0, 1)).append("ma").append(aa).append(" ");
            }

        }
        return sb.toString().substring(0,sb.length()-1);

    }
}
