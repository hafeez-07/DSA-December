
import java.io.*;
import java.util.*;

public class StockMaxProfit {

    public int maxProfit(int prices[]) {
        int minSoFar = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < minSoFar) {
                minSoFar = price; 
            }else {
                profit = Math.max(profit, price - minSoFar);
            }

        }

        return profit;

    }

    public static void main(String[] args) throws Exception {

        StockMaxProfit obj = new StockMaxProfit();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prices[] = new int[5];
        System.out.println("Enter the 5 pricesay elements");
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        int result = obj.maxProfit(prices);
        System.out.println("Profit : " + result);

    }
}
