package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,23 ,34 ,54 ,77,89,99};
        int target = 77;
        int res = Binary_search(arr, target);
        System.out.println(res);
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
