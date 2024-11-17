package com.ali;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class matrix_search {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10,20,30,40},
                {12,23,34,45},
                {13,24,35,46},
                {14,25,36,47}
        };
        int target = 34;
        int[] res = search(arr2, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length - 1;

        while(r <  matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }return new int[]{-1,1};
    }

}
