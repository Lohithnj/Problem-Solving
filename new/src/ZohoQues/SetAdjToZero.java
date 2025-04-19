package ZohoQues;

import java.util.Arrays;

public class SetAdjToZero {
    public static void main(String[] args) {
        int[][] arr={
                {1,0,1},
                {0,1,0},
                {1,1,1}
        };
        int m=arr.length-1,n=arr[0].length-1;
        for(int i=0;i<m;m++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    if(i>0)//top
                        arr[i-1][j]=-1;
                    if(i<m)//bottom
                        arr[i+1][j]=-1;
                    if(j>0)//left
                        arr[i][j-1]=-1;
                    if(j<n)//right
                        arr[i][j+1]=-1;
//                    if(i>0 || i<m || j>0 || j<n)
//                        arr[i][j]=-1;
                }
            }
        }
//        for(int i=0;i<m;m++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(arr[i][j]==-1)
//                    arr[i][j]=0;
//            }
//        }
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
