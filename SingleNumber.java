public class SingleNumber {
    public static int singleNumber(int []nums){
        int  result=0;
        for(int x : nums){
            result^=x;
        }
        return result;
    }
    public static void main(String[] args) {
        int []nums={1,2,2,1,3};
        int result=singleNumber(nums);
        System.out.println(result);
    }
}
