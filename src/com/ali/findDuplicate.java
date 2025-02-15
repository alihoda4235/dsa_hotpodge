package com.ali;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class findDuplicate {
    public static void main(String[] args) {
         int[] arr = {4,5,3,1,6,7,4,2,3,6};
         int[] arr2 = {3 , 4 ,2 , 1 ,5};
       }


       static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
       }


       static int cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){

            if(arr[i] != i + 1) {
                int correct_index = arr[i] - 1;
                if(arr[i] != arr[correct_index] ) {
                    swap(arr, i, correct_index);
                }else{
                    return arr[i];
                }
            } else {
                     i++;
            }
        }
            return -1;
       }};

       //{2,4,1,3,5}


