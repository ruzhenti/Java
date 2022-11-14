//https://leetcode.com/problems/find-duplicate-file-in-system/   №609
import java.util.*;
import java.util.stream.Collectors;
public class DZ_5_4 {    
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, Set<String>> contentToDirectoryMapping = new HashMap<>();
        for (String path : paths) {
            String[] splits = path.split("\\s+");
            String directoryName = splits[0];
            for (int i = 1; i < splits.length; i++) {
                int contentStartIdx = splits[i].indexOf('(');
                String fileName = splits[i].substring(0, contentStartIdx);
                String content = splits[i].substring(contentStartIdx + 1, splits[i].length() - 1);
                contentToDirectoryMapping.computeIfAbsent(content, k -> new HashSet<>())
                .add(directoryName + "/" + fileName);
            }
        }
        return contentToDirectoryMapping.values().stream()
        .filter(e -> e.size() > 1)
        .map(ArrayList::new)
        .collect(Collectors.toList());
    }
	
    public static void main (String[] args) {        
        String [] str1 ={"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
        System.out.println(Arrays.toString(str1));
        System.out.println();        
        List<List<String>> res= findDuplicate (str1);
        System.out.println(res);        
    }
}