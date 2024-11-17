package com.ali;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class bop {
    public static void main(String[] args) {
        int[] ans = {-1 , -1 };
        int[] arr = {1,2,34,34,45};
        int target = 34;
        ans[0] = index_Check(arr,target,true);
        ans[1] = index_Check(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }

    //
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1 };
        ans[0] = index_Check(nums,target,true);
        ans[1] = index_Check(nums,target,false);
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    //

        static int index_Check(int[] nums,int target,boolean findFirstIndex){
         int ans = -1;
         int start = 0;
         int end = nums.length-1;

         while(start <= end){

             int mid = start + (end-start) / 2;

                 if (target < nums[mid]) {
                     end = mid - 1;
                 } else if (target > nums[mid]) {
                     start = mid + 1;
                 } else {
                     //potential ans found
                     ans = mid;
                     if(findFirstIndex){
                         end = mid - 1;
                     }else{
                         start = mid + 1;
                     }
                 }


         }
         return ans;
        }

}
