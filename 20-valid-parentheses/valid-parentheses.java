import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets ko stack mein push karo
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing bracket aaya
            else {

                // Agar stack empty hai, matching opening bracket nahi hai
                if (stack.isEmpty()) {
                    return false;
                }

                // Top opening bracket ko nikalo
                char top = stack.pop();

                // Check karo ki brackets match karte hain ya nahi
                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // Agar sab brackets properly close hue hain,
        // to stack empty hoga
        return stack.isEmpty();
    }
}