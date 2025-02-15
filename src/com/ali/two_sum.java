package com.ali;

import java.util.HashMap;

public class two_sum {

    public int[] twoSum(int[] nums, int target) {



         HashMap<Integer,Integer> map =new HashMap<>();

         //array for complements
        for(int i =0;i<=nums.length;i++){
            int complement = target - nums[i];

        if(map.containsKey(complement)){
            return new int[] {i, map.get(complement)};
        }

        //doesn't exist
            map.put(nums[i],i);


        }


        return new int[] {};

    }

}
