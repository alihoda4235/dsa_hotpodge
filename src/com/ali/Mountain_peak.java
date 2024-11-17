package com.ali;

public class Mountain_peak {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 5, 3, 1};
        System.out.println(find(arr));
        //find peak value in an peak_mountain array
    }

    static int find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                end = mid;
            } else {
                //asc part
                start = mid + 1;
            }
        }
        return start;
    }
}
