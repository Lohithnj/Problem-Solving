package NandhaSirClass.Pattern;

public class Alphabet {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            char ch='A';
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int k=n-i+1;k<=n;k++)
            {
                System.out.print((char)k+ch);

            }
            System.out.println();
        }
    }
}
