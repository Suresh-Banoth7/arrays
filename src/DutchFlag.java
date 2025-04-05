import java.util.Arrays;

public class DutchFlag {

    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};

        int[] ans = dutchFlag(a);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] dutchFlag(int[] a) {

        int n =a.length;
        int low = 0 , mid =0, high = n-1;

        while(mid < high){

            if(a[mid]==0){
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                swap(a,mid,high);
                high--;
            }
        }
        return a;
    }

    private static void swap(int[] a, int mid, int high) {

        int temp = a[mid];
        a[mid]=a[high];
        a[high] = temp;
    }
}
