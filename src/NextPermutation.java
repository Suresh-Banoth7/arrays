import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] a = {2,1,5,4,3,0,0};

         int[] ans =  nextPremutation(a);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] nextPremutation(int[] a) {

        int n = a.length;
        int index =-1;
        // traverse from back  for finding index with minimum value

        for(int i = n-2 ; i>=0;i--){

            if(a[i]<a[i+1]){
                index = i;
                break;
            }
        }

        if(index==-1){

            reverse(a,0,n-1);
            return a;
        }

        for(int i=n-1 ; i>index; i--){

            if(a[i]>a[index]){
                swap(a,i,index);
                break;
            }
        }

        reverse(a,index+1,n-1);
        return a;
    }

    private static void reverse(int[] a, int start, int end) {

        while(start <end){

            swap(a,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] a, int start, int end) {

        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
