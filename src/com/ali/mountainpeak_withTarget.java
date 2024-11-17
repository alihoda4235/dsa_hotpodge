package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class mountainpeak_withTarget {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,5,3,1};
        int target = 3;

      int a = searchmountaintarget(arr,target);
        System.out.println(a);
    }


    static int searchmountaintarget(int[] arr,int target){
        int peak = find(arr);
        int firstTry = Binary_search(arr,target,0,peak);
        if (firstTry !=  -1){
            return firstTry;
        }else {
            return Binary_search(arr,target,peak+1,arr.length - 1 );
        }

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

    static int Binary_search(int[] arr, int target, int start , int end) {

       boolean asc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
                }
            else
                {
                if(target > arr[mid]) {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }


        return -1;

    }
}
