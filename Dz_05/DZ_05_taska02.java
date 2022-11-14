//https://leetcode.com/problems/count-common-words-with-one-occurrence/   №2085
import java.util.*;
public class DZ_05_taska02 {       
    public static int countWords(String[] words1, String[] words2) {
        Map<String, int[]> map = new HashMap<>();
        buildFrequencyMap(words1, map, 0);
        buildFrequencyMap(words2, map, 1);
        return (int) map.entrySet().stream()
            .filter(entry -> entry.getValue()[0] == 1 && entry.getValue()[1] == 1)
            .count();
    }    

    private static void buildFrequencyMap(String[] words, Map<String, int[]> map, int idx) {
        for (String word : words) {
          map.computeIfAbsent(word, k -> new int[2])[idx]++;
        }
    }	
    public static void main (String[] args) {        
        String [] str1 ={"leetcode","is","amazing","as","is"};
        String [] str2 ={"amazing","leetcode","is"};
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str2));
        
        int res=countWords(str1,str2);
        System.out.println(res);        
    }
}