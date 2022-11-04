//https://leetcode.com/problems/remove-element/      №27
//
import java.util.Arrays;
public class DZ_1_task02 {
    public static void main(String[] args)  {
        int [] nums = {0,1,2,2,3,0,4,2};  //Input array
        int val = 2;  //Value to remove
        int k;
        int count=0;       
        
        System.out.println( Arrays.toString(nums));  //  orignal array
        for (int i=0; i<nums.length; i++) {  // ск раз val в массиве nums
            if (nums[i]==val) {
                count=count+1;
                nums[i]=(Integer.MAX_VALUE);
            } 
        }
        Arrays.sort(nums);
        System.out.println( Arrays.toString(nums));  //final array
        k=nums.length-count;
        System.out.println(k);  // answer
    }
}