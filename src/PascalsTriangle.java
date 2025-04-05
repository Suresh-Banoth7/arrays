import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        int rows = 5;
      List<List<Integer>> ans = pascalsTriangle(rows);

       for(List<Integer> a : ans){
           System.out.println(a);
       }
    }

    private static List<List<Integer>> pascalsTriangle(int rows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=rows;i++){
            List<Integer> temp = new ArrayList<>();
          
            for(int col =1 ; col<=i; col++){

                temp.add(nCr(i-1,col-1));
            }
            ans.add(temp);
        }

        return ans;
    }

    private static Integer nCr(int row, int col) {

        int res =1;

        for(int i=0;i<col;i++){

            res = res*(row-i);
            res = res/(i+1);
        }
        return res;
    }
}
