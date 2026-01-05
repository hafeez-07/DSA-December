
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesis {

    public static boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char x : s.toCharArray()) {
            if (x == '(' || x == '{' || x == '[') {
                st.push(x);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if (x == ')' && top != '(') {
                    return false;
                }
                if (x == ']' && top != '[') {
                    return false;
                }
                if (x == '}' && top != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){[]}";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
