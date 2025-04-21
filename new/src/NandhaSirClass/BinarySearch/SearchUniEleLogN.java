package NandhaSirClass.BinarySearch;

public class SearchUniEleLogN
    {
public static void main(String[] args) {

    int[] arr = {1, 1, 2, 2, 3, 3, 6, 6, 7, 8, 8};
    int s = 0, e = arr.length;
    while (s <= e) {
        int mid = s + (e - s) / 2;
        if ((arr[mid + 1] != arr[mid])&& (arr[mid - 1]!=arr[mid])) {
            System.out.println(arr[mid]);
            break;
        }
        //Move the mid to the first element of the occurance,to check it is present in the even index if it is
//        even index then the element is present in the right side because there are even no of elements are present in the left side.
        if(arr[mid-1]==arr[mid])
            mid=mid-1;

        if(mid%2==0)
            s=mid+1;
        else
            e=mid-1;
    }

    }
}
