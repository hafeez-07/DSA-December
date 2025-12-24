
public class HighestAltitude {

    public static int largestAltitude(int gain[]) {
        int altitude=0,maxAltitude=0;
        for(int x:gain){
            altitude+=x;
            maxAltitude=Math.max(maxAltitude,altitude);
        }
       

        return maxAltitude;
    }

    public static void main(String[] args) throws Exception {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int result = largestAltitude(gain);
        System.out.println("Largest altitude : " + result);
    }
}
