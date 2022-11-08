//https://leetcode.com/problems/valid-parentheses/    №20

import java.util.*;
public class DZ_4_taska1 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                st.push(it);
            }
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop(); 
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main (String[] args) {
		
		String t="(){[{}]}";
		if(isValid(t)==true) {
		    System.out.println("True");
        }
		else {
		    System.out.println("False");
        }
	}
}