package ZohoQues;
import java.util.*;
public class OddEvenPattern
    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(i%2!=0)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(j%2!=0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                else
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(j%2==0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--)
            {
                if(i%2!=0)
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(j%2!=0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                else
                {
                    for(int j=1;j<=i;j++)
                    {
                        if(j%2==0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

