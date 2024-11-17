package com.ali;

import static com.ali.Sorting_ALgs.swap;

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            int correctValue = nums[i];
            if (i < nums.length && nums[i] != correctIndex) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != i) {
                return nums[index];
            }
        }


        return nums.length;
    }


    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}