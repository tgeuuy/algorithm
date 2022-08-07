package test;

/**
 * @Author tgeuuy
 * @Date 2021/12/24 11:47
 * @Version 1.0
 */
public class JudgeArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 9, 5, 6, 7, 8};
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
