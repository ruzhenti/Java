//https://leetcode.com/problems/intersection-of-two-arrays-ii/ №350
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class DZ_5_01 {   
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> map = Arrays.stream(nums1).boxed()
            .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        for (int num : nums2) {
          if (map.getOrDefault(num, 0L) > 0) {
            result.add(num);
            map.put(num, map.get(num) - 1);
          }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
      }

    public static void main (String[] args) {        
        int [] mass1 = {4,9,5};
        int [] mass2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));        
        int [] res=intersect(mass1, mass2);
        System.out.println(res.length);
        System.out.println(Arrays.toString(res));   
    }
}