package ZohoQues;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] unit={"Zero",
                "one","two","three","four","five","six","seven","eight","nine","ten",
                "Eleven","twelve","thirteen","fourteen","Fifteen","Sixteen","seventeen","eighteen","nineteen"
        };
        String[] ten={"","","Twenty","Thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String res="";
        if(n>=100)
        {
            res+=unit[n/100]+" Hundred";
            n=n%100;
        }
        if(n>=20) {
            res += " and " + ten[n / 10]+" "+unit[n%10];
        }
        else
        {
            res+=unit[n];
        }
        System.out.println(res);
    }
}
