package com.ali;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class matrix_ascending {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10,20,30,40},
                {12,23,34,45},
                {13,24,35,46},
                {14,25,36,47}
        };
        int target = 34;
        int[] res = search(arr2, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        return new int[]{-1,1};
    }


    static int Binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
//still complete
