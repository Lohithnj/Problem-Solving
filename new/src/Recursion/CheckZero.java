package Recursion;

public class CheckZero {
    public static void main(String[] args) {
        int ans=checkZero(1020002,0);
        System.out.println(ans);
    }
    static int checkZero(int n,int c)
    {
        if(n==0)
            return c;
        if(n%10 == 0)
        return checkZero(n/10,c+1);
        return checkZero(n/10,c);

    }
}
