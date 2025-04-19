package NandhaSirClass.TwoDimension;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int row=3;
        int col=3;
        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<col;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
//        for(int i=0;i<row;i++)
//        {
//            for(int j=0;j<col;j++)
//            {
//                System.out.println();
//            }
//        }
        System.out.println(Arrays.deepToString(arr));


    }
}
