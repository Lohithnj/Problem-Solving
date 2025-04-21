package Recursion;

import java.util.Arrays;

public class Pattern1 {
    static void trinagle(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            System.out.print("*");
            trinagle(r, c + 1);
        } else {
            System.out.println();
            trinagle(r - 1, 0);
        }
    }

    static void trinagle1(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            trinagle1(r, c + 1);
            System.out.print("*");

        } else {
            trinagle1(r - 1, 0);
            System.out.println();

        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            System.out.print("*");
            trinagle(r, c + 1);
        } else {
            System.out.println();
            trinagle(r - 1, 0);
        }
    }

    public static void main(String[] args) {
        trinagle(4, 0);
        trinagle1(4, 0);
        int[] arr = {1, 2, 34, 3, 2, 5, 6};
        bubble(arr,1,1);
    }


}

