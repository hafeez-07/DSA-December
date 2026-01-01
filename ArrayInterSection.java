
import java.util.*;

public class ArrayInterSection {

    public static int[] arrayIntersect(int num1[], int num2[]) {

        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(num1.length, num2.length)];
        Arrays.sort(num1);
        Arrays.sort(num2);

        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                i++;
            } else if (num1[i] > num2[j]) {
                j++;
            } else {
                result[k] = num1[i];
                k++;
                i++;
                j++;
            }
        }

        return Arrays.copyOf(result, k);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {1, 4, 8};
        int[] intersect = arrayIntersect(num1, num2);
        for (int x : intersect) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());

    }
}
