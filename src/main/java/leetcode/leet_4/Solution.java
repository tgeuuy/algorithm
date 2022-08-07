package leetcode.leet_4;

import org.junit.Test;

public class Solution {
    public  static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length;
        int[]  tmp=new int[len1+len2];

        if (len1==0&&len2==0) return 0;
        int i=0,j=0,k=0;
        while (i<len1 && j<len2)
        {
            if (nums1[i]<nums2[j]) tmp[k++]=nums1[i++];
            else tmp[k++]=nums2[j++];
        }
        while (i<len1) tmp[k++]=nums1[i++];
        while (j<len2) tmp[k++]=nums2[j++];
        int len=tmp.length;
        System.out.println("len="+len);
        System.out.println("ddddd" + 3/2);
        for (int value : tmp) System.out.print(value + "  ");
        if(len%2==1) return tmp[len/2];
            else return (double) (tmp[len/2-1]+tmp[len/2])/2;

        //return 0;
    }

    @Test
    public void save() {
        int[] nums1=new int[]{1,2};
        int   nums2[]={3,4};

        double res=findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
}
