package leetcode.leet_922;

import org.junit.Test;


public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int  j = 1;
        for (int i=0;i<A.length;i=i+2)
        {

            if (A[i]%2==1){
                while (A[j]%2==1)
                {

                    j=j+2;
                }
                swap(A,i,j);

            }

        }
        return A;

    }
    public void swap(int[]  A ,int i,int j){

        A[i]=A[i]+A[j];
        A[j]=A[i]-A[j];
        A[i]=A[i]-A[j];

    }

    @Test
    public void practice() {
        int[] A = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] res = sortArrayByParityII(A);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

}
