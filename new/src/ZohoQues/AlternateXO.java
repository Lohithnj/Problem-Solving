package ZohoQues;

import java.util.Arrays;

public class AlternateXO {
    public static void main(String[] args) {
        int row=10,col=10;
        int top=0,left=0,right=col-1,bottom=row-1;
        char[][] arr=new char[row][col];
        char ch='X';
        int c=0;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                arr[top][i]=ch;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr[i][right]=ch;
            }
            right--;
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = ch;
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = ch;
                }
                left++;
                c++;
                if (c % 2 == 0)
                    ch = 'X';
                else
                    ch = 'O';
            }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.print(Arrays.deepToString(arr));
    }
}
