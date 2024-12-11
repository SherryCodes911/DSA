package LAB5;
import java.util.Stack;
public class validParenthesis {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        validParenthesis solution = new validParenthesis();


        String input = "({[]})"; // Example input
        boolean result = solution.isValid(input);
        System.out.println("input valid: " + result);
    }
}
