//https://leetcode.com/problems/build-array-from-permutation/   №1920
//
import java.util.Arrays;
public class DZ_1_task01 {
    public static void main(String[] args)  {
        int [] nums = {0,2,1,5,3,4};
        int[] ans = new int[nums.length];
            for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
            };
        System.out.println("orignal array: ");
        System.out.println( Arrays.toString(nums));
        System.out.println("resulting array: ");
        System.out.println(Arrays.toString(ans));
    }
}