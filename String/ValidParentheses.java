package String;
import java.util.*;
public class ValidParentheses {
	public boolean isValid(String s) {
        if(s == null || s.length() == 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else{
                if(stack.isEmpty())
                    return false;
                if(stack.peek() == '(' && s.charAt(i) != ')')
                    return false;
                if(stack.peek() == '{' && s.charAt(i) != '}')
                    return false;
                if(stack.peek() == '[' && s.charAt(i) != ']')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
