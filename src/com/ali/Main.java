package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {99,89,78,67,45,33,2,-67};
        int target = -67;
        int res = Binary_search(arr,target);
        System.out.println(res);
    }

        static int Binary_search(int[] arr,int target){
         int start = 0;
         int end = arr.length-1;

         boolean asc = arr[start] < arr[end];

         while(start <= end){

             int mid = start + (end-start) / 2;

             if(target == arr[mid]){
                 return  mid;
             }

             if(asc) {
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }else{
                 if (target > arr[mid]) {
                     end = mid - 1;
                 } else  {
                     start = mid + 1;
                 }
             }
         }
         return -1;
        }

}
