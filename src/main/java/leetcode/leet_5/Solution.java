package leetcode.leet_5;

import org.junit.Test;

public class Solution {
    public static String longestPalindrome(String s) {
        int len=s.length();
        if (len<2) return s; //特判
        int maxlen=1;
        int start=0;
        boolean[][]  dp=new boolean[len][len];
        char[] chars = s.toCharArray();
        for(int i=0;i<len;i++)  dp[i][i] = true;
        for(int j=1;j<len;j++)
        {
            for(int i=0;i<j;i++)
            {
                if(chars[i]!=chars[j]) {
                    dp[i][j] = false;
                } else {
                    if(j-i<3) {
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if(dp[i][j] && j-i+1>maxlen)
                {
                    maxlen = j-i+1;
                    start=i;

                }
               // System.out.println("maxlen="+maxlen);
                //System.out.println("start="+start);
            }
        }
        return  s.substring(start,start+maxlen);
    }

    @Test
    public void save() {

        String str="aacabdkacaa";

        String res=longestPalindrome(str);

        System.out.println(res);

    }
}
