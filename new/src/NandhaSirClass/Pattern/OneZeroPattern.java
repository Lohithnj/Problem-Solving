package NandhaSirClass.Pattern;

public class OneZeroPattern {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j) %2 ==0 )
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
