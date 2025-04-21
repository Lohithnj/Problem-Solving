package NandhaSirClass.Pattern;

public class BoxXPattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i==1 || j==1 || j==2*n-1 ||i==2*n-1 || i==j || i+j==2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
