
import java.io.*;
import java.util.*;

public class LongestCommonPrefix {

    public String findPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return prefix.toString();
            }
            prefix.append(first.charAt(i));

        }
        return prefix.toString();

    }

    public static void main(String[] args) throws Exception {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String strs[] = new String[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 3 strings");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            strs[i] = st.nextToken();
        }
        String result = obj.findPrefix(strs);
        System.out.println("result : " + result);

    }
}
