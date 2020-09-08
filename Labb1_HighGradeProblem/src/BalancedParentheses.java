import java.lang.reflect.Array;

public class BalancedParentheses {

    ResizingArrayStack<Object> stack;

    public BalancedParentheses(){
        stack = new ResizingArrayStack<>();
    }

    boolean isBalanced(String parentheses){
        int i = 0;
        while (i < parentheses.length()) {
            if (parentheses.charAt(i) == '(' ||
                    parentheses.charAt(i) == '[' ||
                    parentheses.charAt(i) == '{') {
                stack.push(parentheses.charAt(i));
            }
            else if (parentheses.charAt(i) == ')' ||
                    parentheses.charAt(i) == ']' ||
                    parentheses.charAt(i) == '}') {

                char popped = (char) stack.pop();

                switch (parentheses.charAt(i)) {
                    case ')':
                        if (popped !='(')
                            return false;
                        break;
                    case ']':
                        if (popped !='[')
                            return false;
                        break;
                    case '}':
                        if (popped !='{')
                            return false;
                        break;
                }
            }
            i++;
        }
        if(stack.isEmpty()&& i == parentheses.length())
            return true;
        else return false;
    }

}
