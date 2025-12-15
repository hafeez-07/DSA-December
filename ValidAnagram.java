
import java.io.*;
import java.util.*;

public class ValidAnagram {

    Boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    /*
    Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

    Boolean isAnagram (String s, String t)
    {
        if(s.length() != t.length()) return false;

        int a[] = s.codePoints().sorted().toArray();
        int b[] = t.codePoints().sorted.toArray();

        return Arrays.equals(a,b);
    
    }
    
     */
    public static void main(String[] args) throws Exception {
        ValidAnagram obj = new ValidAnagram();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter two strings in a same line");
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String t = st.nextToken();
        Boolean result = obj.isAnagram(s, t);
        System.out.println("Result : " + result);

    }
}
