package ZohoQues;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length - 1;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        ArrayList<int[]> list = new ArrayList<>();
        while (i <= n) {
            int newstart = intervals[i][0];
            int currentend = intervals[i][1];
            while (i < n && currentend >= intervals[i + 1][0]) {
                currentend = Math.max(currentend, intervals[i + 1][1]);
                i++;
            }
            list.add(new int[]{newstart, currentend});
            i++;
        }
        int ind = 0;
        int[][] arr = new int[list.size()][2];
        for (int[] a1 : list) {
            arr[ind++] = a1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {1, 3}, {7, 18}, {8, 10}};
        System.out.println(Arrays.deepToString(merge(arr)));

    }
}
