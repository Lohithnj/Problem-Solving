package SlidingWindow;

import java.util.*;

public class MaxLenSumLessThanK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = 100;
        int[] arr = {30, 40, 50, 20, 20, 10, 90, 10, 10, 10};
        int sum = 0, max = 0, i = 0, j = 0;

        while (j < arr.length) {  // Ensure j stays within bounds
            sum += arr[j];  // Add the current element to the sum

            // If the sum exceeds or is equal to k, shrink the window from the left
            while (sum >= k && i <= j) {
                sum -= arr[i];  // Subtract arr[i] from the sum
                i++;  // Move i to the right
            }

            // Update the maximum length of valid subarray
            max = Math.max(max, j - i + 1);

            j++;  // Move j to the right to extend the window
        }
        System.out.println(max);
    }
}
