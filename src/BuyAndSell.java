public class BuyAndSell {

    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        int ans = buyAndSell(a);
        System.out.println(ans);
    }

    private static int buyAndSell(int[] a) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n =a.length;

        for(int i=1;i<n;i++){

            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]-min);
        }
        return max;
    }
}
