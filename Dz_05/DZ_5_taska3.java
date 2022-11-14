//https://leetcode.com/problems/contains-duplicate-ii/ №219
import java.util.*;
public class DZ_5_taska3 { 
    public static boolean blizko(int[] nums,int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            }
        map.put(nums[i], i);
        }
    return false;
    }	
    public static void main (String[] args) {        
        int [] test1 ={1,2,3,1,2,3};
        System.out.println(Arrays.toString(test1));
        int rasst=2;
        boolean da_net=false;        
        da_net=blizko(test1,rasst);
        System.out.println(da_net);        
    }
}