
import java.io.*;
import java.util.HashSet;

public class ContainsDuplicate {

    boolean containsDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        ContainsDuplicate obj = new ContainsDuplicate();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = {1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);
        System.out.println("Result : " + result);

    }
}
