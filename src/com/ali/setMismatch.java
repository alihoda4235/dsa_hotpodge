package com.ali;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            {
                int correct_index = nums[i] - 1;
                if (nums[i] != nums[correct_index]) {
                    swap(nums, i, correct_index);
                } else {
                    i++;
                }
            }}

            for(int index=0 ; index<nums.length;index++){
                if(nums[index] != index+1){
                    return new int[] {nums[index],index+1};
                }
            };
        return new int[] {-1 ,1};
    };


       static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
       }


       public int[] cyclic(int[] nums) {
           int i = 0;
           while (i < nums.length) {

               int correct_index = nums[i] - 1;
               if (nums[i] != nums[correct_index]) {
                   swap(nums, i, correct_index);
               } else {
                   i++;
               }
           }

               for(int index=0 ; index<nums.length;i++){
                   if(nums[index] != index+1){
                       return new int[] {nums[index],index+1};
                   }
               }
           return new int[] {-1 ,1};
}
}

       //{2,4,1,3,5}


