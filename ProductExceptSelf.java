
public class ProductExceptSelf {

    public static int[] getProductExceptSelf(int nums[]) {
        int[] result = new int[nums.length];
        int left = 1, right = 1;

        //suffix product
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }

        //suffix product
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int[] nums = {2, 4, 6};
        int[] result = getProductExceptSelf(nums);
        for (int val : result) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString());
    }
}
