
public class LongestPalindromicSubstring {

    static int start = 0, end = 0;

    public static String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++) {
            //odd length palindrome
            expand(s, i, i);
            //even length palindrome
            expand(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }

    public static void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        //return left and right back to original index(after failing in while cond)
        left++;
        right--;
        if (right - left > end - start) {
            start = left;
            end = right;
        }
    }

    public static void main(String[] args) {
        String s = "cbbd";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}
