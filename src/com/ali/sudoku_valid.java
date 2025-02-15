package com.ali;

import java.util.HashSet;

public class sudoku_valid {

    public boolean isValidSudoku(char[][] board) {
        //check row
        for(int row=0;row<9;row++){
            HashSet<Character> set = new HashSet();
            for(int i=0;i<9;i++){
                if(board[row][i] == '.') continue;

                if(set.contains(board[row][i])) return false;
                set.add(board[row][i]);
            }
        }



        //check col
        for(int col=0;col<9;col++){
            HashSet<Character> set = new HashSet();
            for(int i=0;i<9;i++){
                if(board[i][col] == '.') continue;

                if(set.contains(board[i][col])) return false;
                set.add(board[i][col]);
            }
        }




        //check sub_boxes
        for (int i = 0; i <9 ; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k <3 ; k++) {

                    int row = (i/3) * 3 + j;
                    int col = (i%3) * 3 + k;

                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);

                }

            }

        }







        //

        return true;

    }

    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '4', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '.', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'2', '.', '.', '.', '5', '.', '.', '.', '6'},
                {'3', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        sudoku_valid sudoku = new sudoku_valid();
        boolean op = sudoku.isValidSudoku(board);
        System.out.println(op);
    }

}
