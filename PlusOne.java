
public class PlusOne {

    public static int[] plusOne(int digits[]) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] digits = {1,9,9};
        digits=plusOne(digits);
        for (int x : digits) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());
    }
}
