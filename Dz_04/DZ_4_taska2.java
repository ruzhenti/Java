//https://leetcode.com/problems/evaluate-reverse-polish-notation/   №150
import java.util.*;
public class DZ_4_taska2 {
  
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String str = tokens[i];

            if (str.equals("+") || str.equals("*") || str.equals("/") || str.equals("-")) {
                int a2 = stack.pop();
                int a1 = stack.pop();
                if (str.equals("+"))
                    stack.push(a1 + a2);
                else if (str.equals("-"))
                    stack.push(a1 - a2);
                else if (str.equals("*"))
                    stack.push(a1 * a2);
                else if (str.equals("/"))
                    stack.push(a1 / a2);
            } 
            else stack.push(Integer.parseInt(str));

        }

        return stack.pop();
    }

    public static void main (String[] args) {
        
        String [] str1 ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
      
        int res = evalRPN ( str1 );
        System.out.println ( res );
        
    }
}