package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int res=sumofdigit(12345);
        System.out.println(res);
    }
    static int sumofdigit(int n){
        if(n==0)
            return 0;
        return n%10 + sumofdigit(n/10);
    }


    }
