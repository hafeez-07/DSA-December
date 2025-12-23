
import java.io.*;
import java.util.*;

public class ContainerWithMostWater {

    public static int maxArea(int heights[]) {
        int left = 0, right = heights.length - 1, maxArea = 0;

        while (left < right) {
            int height = (heights[left] < heights[right]) ? heights[left] : heights[right];
            int width = right - left;
            maxArea = Math.max(maxArea, height * width);

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxArea;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array of heights");
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] heights = new int[6];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }
        int maxArea = maxArea(heights);
        System.out.println("maxArea :" + maxArea);

    }
}
