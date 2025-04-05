

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};

        int[][] ans = setMatrixZero(matrix);

        for(int[] res : ans){
            System.out.println(Arrays.toString(res));
        }
    }

    private static int[][] setMatrixZero(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;



        // check zero in first row
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                firstRowZero = true;
            }
        }

        // check zero in first col

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
            }
        }

        // check in between first col and first row

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){

                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }

        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRowZero){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }

        if(firstColZero){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
        return matrix;
    }
}

