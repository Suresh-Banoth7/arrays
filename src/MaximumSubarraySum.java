public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};

       int ans =  maximumSubarraySum(a);
        System.out.println(ans);
    }

    private static int maximumSubarraySum(int[] a) {

        int max = 0;

        int sum=0;
        for(int i=0;i<a.length;i++){
             sum+=a[i];

            if(sum>max){
                max = sum;
              //  System.out.println(max);
            }
            else if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
}
