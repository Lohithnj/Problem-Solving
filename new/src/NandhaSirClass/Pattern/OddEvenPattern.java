package NandhaSirClass.Pattern;

public class OddEvenPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=2*n+1;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=2*n;j++)
                {
                    System.out.print(i);
                }
                System.out.print(i+1);
                System.out.println();
            }
            else
            {
                System.out.print(i+1);
                for(int k=1;k<=2*n;k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
