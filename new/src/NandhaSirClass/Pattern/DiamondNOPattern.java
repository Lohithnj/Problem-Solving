package NandhaSirClass.Pattern;

public class DiamondNOPattern {
    public static void main(String[] args) {
        int n=9;
        //pyramid pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>1;k--)
            {
                System.out.print(k);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        //Inverted Pattern
        for(int i=n-1;i>=1;i--) //start from i=n-1 to remove one row.
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>1;k--)
            {
                System.out.print(k);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
