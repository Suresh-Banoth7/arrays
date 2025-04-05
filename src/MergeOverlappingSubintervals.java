import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingSubintervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        List<List<Integer>> ans = mergeOverlappingSubintervals(intervals);

        for(List<Integer> res : ans){
            System.out.println(res);
        }
    }

    private static List<List<Integer>> mergeOverlappingSubintervals(int[][] intervals) {

        List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(intervals , (a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++){

            int s = intervals[i][0];
            int e = intervals[i][1];

            if(s <= end){
                end = Math.max(e,end);
            }else{
                ans.add(Arrays.asList(start,end));
                start=s;
                end = e;

            }

        }
        ans.add(Arrays.asList(start,end));

        return ans;
    }
}
