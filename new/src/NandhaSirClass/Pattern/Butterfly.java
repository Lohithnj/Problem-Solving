package NandhaSirClass.Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n=10;
        //Upper half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i>=j || i+j>=2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //Lower half
        for(int i=n-1;i>=1;i--) //Change only here
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(i>=j || i+j>=2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
