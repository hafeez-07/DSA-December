import java.util.*;

public class KidsWithCandies {

    public static List<Boolean> kidsWithGreaterCandies(int[] candies, int extraCandies) {
        if(candies.length==0) return new ArrayList<>();
       
        int maxCandie = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxCandie) {
                maxCandie = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandie);
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int[] candies = {4, 2, 3, 5, 1};
        int extraCandies = 3;
        List<Boolean>ans = kidsWithGreaterCandies(candies, extraCandies);
        for (boolean x : ans) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString());

    }
}
