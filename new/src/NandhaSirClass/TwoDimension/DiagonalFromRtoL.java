package NandhaSirClass.TwoDimension;

public class DiagonalFromRtoL {
    public static void main(String[] args) {

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int row=3;
        int col=3;
        //for first part.
        for(int c=0;c<col;c++)
        {
            int i=0,j=c;
            while(i<row && j>=0)
            {
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
        }
        //for remianing part of array
        for(int r=1;r<row;r++)
        {
            int i=r,j=col-1;
            while(i<row && j>=0)
            {
                System.out.print(arr[i][j]+" ");
                i++;
                j--;
            }
        }
    }
}
