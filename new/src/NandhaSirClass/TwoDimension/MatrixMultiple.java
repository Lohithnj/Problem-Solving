package NandhaSirClass.TwoDimension;

import java.util.Arrays;

public class MatrixMultiple {
    public static void multiplyMatrix(int row1,int col1,int[][] a,int row2,int col2,int[][] b){
        int[][] arr=new int[row1][col2];
        for(int r=0;r<row1;r++)
        {
            for(int c=0;c<col2;c++)
            {
                for(int k=0;k<row2;k++)
                {
                    arr[r][c]+=(a[r][k]*b[k][c]);
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args)
    {
        int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
        int A[][] = { { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
                { 4, 4, 4 } };
        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 } };
        multiplyMatrix(row1, col1, A, row2, col2, B);
    }

}
