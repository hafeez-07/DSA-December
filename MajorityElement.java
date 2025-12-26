
public class MajorityElement {

    public static int majorityElement(int nums[]) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        int maj = majorityElement(nums);
        System.out.println(maj);
    }
}
