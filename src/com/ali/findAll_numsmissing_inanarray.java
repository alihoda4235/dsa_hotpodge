package com.ali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class findAll_numsmissing_inanarray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 6, 7, 4, 2, 3, 6};
        int[] arr2 = {1,3,2,4,6,7,7};
        List<Integer> res = find_Missing(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(res);

    }

    static List<Integer> find_Missing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct_index = nums[i] - 1;
            if(nums[i] != nums[correct_index]){
                swap(nums,i,correct_index);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(j + 1);
            }
        }
        return ans;

    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}