package ZohoQues;

import java.util.*;

public class Binary {
    static void values(int n,int len,ArrayList<Integer> list) {
        list.add((n*10)+1);
        list.add(n*10);
        if((""+n*10).length()==len)
            return;
        values((n*10)+1,len,list);
        values(n*10,len,list);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=0,len=0;
        int temp=n;
        while(temp>0) {
            if(n%10!=0 && n%10!=1)
                f=1;
            len++;
            temp/=10;
        }
        if(f==0) {
            System.out.print(1);
            return;
        }
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        values(1,len,list);
        Collections.sort(list);
        Collections.reverse(list);
        int i=0;
        while((""+list.get(i)).length()==len) {
            if(n%list.get(i)==0) {
                System.out.print(n/list.get(i));
                return;
            }
            i++;
        }
        int count=0;
        String res="";
        for(int k=0;k<list.size();k++) {
            count+=n/list.get(k);
            res+=(""+list.get(k)+"+").repeat(n/list.get(k));
            n%=list.get(k);
        }
        System.out.print(res.substring(0,res.length()-1));
    }
}

//Input : 32
//Output : 11+11+10