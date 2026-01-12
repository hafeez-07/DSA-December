
import java.util.*;

public class KthLargestElement {

    public static int findKthLargest(int nums[], int k) {

        //using  minimum heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            //add each num to min heap
            minHeap.offer(num);
            //if size of heap exceeds k , rmv minimum number(bcs we only care about largest k elements)
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        //return top or smallest in k heap 
        return minHeap.poll();

        //using sorting
        // Arrays.sort(nums);
        // return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println(result);
    }
}
