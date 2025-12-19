
import java.io.*;
import java.util.HashSet;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0,maxLen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen=Math.max(maxLen,right-left+1);
        }
       

        return maxLen;
    }

    public static void main(String[] args) throws Exception {
        LongestSubString obj = new LongestSubString();
        System.out.println("Enter the string");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("Result :" + result);

    }
}
