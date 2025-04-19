package ZohoQues;

public class DecodingString {
    public static void main(String[] args) {
        String str="a1b10c9";
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                char cur=str.charAt(i-1);
                int val=0;
                while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9')
                {
                    val=val*10+(str.charAt(i)-'0');
                    i++;
                }
                i--;
                int s=1;
                while(s<=val)
                {
                    sb.append(cur+"");
                    s++;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
