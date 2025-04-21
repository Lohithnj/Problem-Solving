package ZohoQues;
//
//import java.util.Scanner;
//
public class FindPosOnSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 8};
        int x1 = 2;
        System.out.println(findInsertPosition(arr1, x1)); // Output: 1,3

        int[] arr2 = {2, 4, 6, 8, 10};
        int x2 = 6;
        System.out.println(findInsertPosition(arr2, x2)); // Output: 6 is already present

        int[] arr3 = {-1, 0, 1, 4};
        int x3 = -3;
        System.out.println(findInsertPosition(arr3, x3)); // Output: 4, NULL
    }

    public static String findInsertPosition(int[] arr, int x) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return x + " is already present";
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int insertPos = left; // Position to insert x

        if (insertPos == arr.length) {
            return (arr.length ) + ", NULL";
        } else {
            return insertPos + "," + arr[insertPos];
        }
    }

}

//package ZohoQues;
////
//import java.util.Scanner;
////
//public class FindPosOnSorted {
//    static String checkPos(int[] arr,int n,int key)
//    {
//        int s=0;
//        int e=arr.length-1;
//        while(s<=e)
//        {
//            int mid=s+(e-s)/2;
//            if(arr[mid]==key)
//                return mid +"is Already present.";
//            else if(arr[mid]<key)
//                s=mid+1;
//            else
//                e=mid-1;
//        }
//        return s+"";
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] arr={2,4,6,8,10};
//        int n=arr.length;
//        int key=sc.nextInt();
//
//        String value=checkPos(arr,n,key);
//        int val=Integer.parseInt(value);
//        if(val < n)
//            System.out.println(value +","+arr[val]);
//        else
//            System.out.println(n+",NULL");
//    }
//}
