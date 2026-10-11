import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } 
            else {
                if (st.isEmpty()) return false;

                char ch = st.peek();
                st.pop();

                if ((ch == '(' && current == ')') ||
                    (ch == '[' && current == ']') ||
                    (ch == '{' && current == '}')) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
