package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RBS {
    public static void main(String[] args) {
        int target = 5;
        int[] arr2 = {4,5,6,7,0,1,2,3};
        int[] arr3 = {4,5,6,6,6,7,0,1,2,3};
        int searchedvalue = search(arr2 , target);
        int dup = findPivotWithduplicate(arr3);
        System.out.println(dup);
        System.out.println(searchedvalue);
    }


    public static int search(int[] nums, int target) {
     int pivot = findPivot(nums);
     if(pivot == -1){
         //not rotated array normal binary search
         return Binary_search(nums,target,0,nums.length - 1);
     }
     //rotated array we get 2 asc arrays
     if(nums[pivot] == target){
         return pivot;
     }

     if(target >= nums[0]){
     return Binary_search(nums,target,0,pivot - 1);
     }
     return  Binary_search(nums,target,pivot + 1 , nums.length - 1);
    };




    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }


        static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            } if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int Binary_search(int[] arr, int target,int start,int end) {

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




    static int findPivotWithduplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end-start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {

                if(arr[start] < arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            //left side is sorted
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
