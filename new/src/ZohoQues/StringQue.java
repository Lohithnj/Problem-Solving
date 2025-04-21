package ZohoQues;


public class StringQue {
    public static void main(String[] args) {
        String str1 = "abbcddeefceeacbbed";
        String str2 = "abbefieefceeacbijd";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        String res1="";
        String res2="";
        int i = 0,occurance=0;
        while (i < arr1.length -1) {
            if(arr1[i]!=arr2[i])
            {
                int start=i;
                occurance++;
                if(occurance>1)
                {
                    res1 += ",";
                    res2 += ",";
                }
                while(i< arr1.length-1 && arr1[i]!=arr2[i])
                {
                    i++;
                }
                res1+=str1.substring(start,i);
                res2+=str2.substring(start,i);
            }
            else
                i++;
        }
        System.out.println(res1);
        System.out.println(res2);


    }
}

