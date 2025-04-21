package ZohoQues;

public class CrossPattern {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char[] arr=str.toCharArray();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(j==i || j==n-i-1)
                    System.out.print(arr[j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
