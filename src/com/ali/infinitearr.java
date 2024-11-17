package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class infinitearr {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4,5,6,7,8,9,11,12,46,90,99};
        int target = 90;
        int op = ans(arr,target);
        System.out.println(op);
    }

    static int ans(int[] arr, int target){
       int start = 0;
        int end =  1  ;


        while( target > arr[end]  ){
            int startNew = end + 1;
            end = end + (end - start + 1) * 2;

            start = startNew;
        }
        return  Binary_search(arr , target, start, end);
    }

    static int Binary_search(int[] arr, int target , int start, int end) {


        while (start <= end) {

            int mid = start + (end - start) / 2;


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
