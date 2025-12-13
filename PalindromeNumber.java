
import java.io.*;

class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int sol = 0;
        while (temp > 0) {
            sol = sol * 10 + temp % 10;
            temp /= 10;
        }
        return x == sol;
    }

    public static void main(String[] args) throws Exception {
        PalindromeNumber obj = new PalindromeNumber();

        System.out.println("Enter the number to check whether it is a palindrome or no");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        boolean result = obj.isPalindrome(number);
        System.out.println("Result : " + result);

    }
}
