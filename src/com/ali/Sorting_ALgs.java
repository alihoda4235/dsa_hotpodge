package com.ali;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sorting_ALgs {
    public static void main(String[] args) {
         int[] arr = {4,5,3,1,6,7,4,2,3,6};
         int[] arr2 = {3 , 4 ,2 , 1 ,5};
         cyclic(arr2);
        System.out.println(Arrays.toString(arr2));


       }


       static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
       }



       static int[] bubble(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1 ;j < arr.length - i; j++){

                if(arr[j-1] > arr[j]){
                    swap(arr,j,j-1);
                }
            }
        }
           return arr;
       }

       static int[] selection(int[] arr){
        int l = arr.length;

        for(int i = 0; i <= l-1 ; i++){
           int minIndex = i;
            for(int j = i + 1;j < l; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,minIndex,i);

        }return arr;
       }



       static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index] ) {
                swap(arr, i, correct_index);
            }else{
                    i++;
                }
            }
        }
       }

       //{2,4,1,3,5}


