import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchRange {

    public static int[] searchRange(int nums[], int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[]{left, right};
    }

    public static int binarySearch(int nums[], int target, boolean isSearchingLeft) {
        int ans = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                ans = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter array of num");
        int []nums=new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }
        System.out.println("Enter target");
        int target=Integer.parseInt(br.readLine());
        

        // int[] nums = {5, 7, 7, 8, 8, 8, 10};
        // int target = 8;
        int[] range = searchRange(nums, target);
        for (int x : range) {
            System.out.print(x + " ");
        }

    }
}
